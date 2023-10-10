package testCases;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class SessionManager  {
	private final ConcurrentHashMap<String, SessionStatus> sessions = new ConcurrentHashMap<>();
    private final Lock sessionLock = new ReentrantLock();

    // Enum to represent session status (open or closed)
    private enum SessionStatus {
        OPEN, CLOSED
    }

    // Function to create a new session
    public void createSession(String sessionId) {
        try {
            sessionLock.lock();
            sessions.put(sessionId, SessionStatus.OPEN);
        } finally {
            sessionLock.unlock();
        }
    }

    // Function to close a session
    public void closeSession(String sessionId) {
        try {
            sessionLock.lock();
            if (sessions.containsKey(sessionId) && sessions.get(sessionId) == SessionStatus.OPEN) {
                sessions.put(sessionId, SessionStatus.CLOSED);
                // Perform session termination here (e.g., driver.quit())
            }
        } finally {
            sessionLock.unlock();
        }
    }

    // Function to delete a session if it's open
    public void deleteSession(String sessionId) {
        try {
            sessionLock.lock();
            if (sessions.containsKey(sessionId) && sessions.get(sessionId) == SessionStatus.OPEN) {
                sessions.remove(sessionId);
                // Send a request to delete the session
            }
        } finally {
            sessionLock.unlock();
        }
    }

    // Example usage
    public static void main(String[] args) {
        SessionManager sessionManager = new SessionManager();
        String sessionId = "5fc58356-d534-4607-a4bf-ec3c1c57f63e";

        // Create a new session
        sessionManager.createSession(sessionId);

        // Close the session (driver.quit() should be called before this)
        sessionManager.closeSession(sessionId);

        // Attempt to delete the session
        sessionManager.deleteSession(sessionId);
    }
}
