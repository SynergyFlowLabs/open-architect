package com.sun.jna.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class Cleaner {
    private static final Cleaner INSTANCE = new Cleaner();
    private Thread cleanerThread;
    private CleanerRef firstCleanable;
    private final ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();

    public interface Cleanable {
        void clean();
    }

    private static class CleanerRef extends PhantomReference<Object> implements Cleanable {
        private final Cleaner cleaner;
        private final Runnable cleanupTask;
        private CleanerRef next;
        private CleanerRef previous;

        public CleanerRef(Cleaner cleaner, Object obj, ReferenceQueue<? super Object> referenceQueue, Runnable runnable) {
            super(obj, referenceQueue);
            this.cleaner = cleaner;
            this.cleanupTask = runnable;
        }

        @Override // com.sun.jna.internal.Cleaner.Cleanable
        public void clean() {
            if (this.cleaner.remove(this)) {
                this.cleanupTask.run();
            }
        }

        CleanerRef getNext() {
            return this.next;
        }

        CleanerRef getPrevious() {
            return this.previous;
        }

        void setNext(CleanerRef cleanerRef) {
            this.next = cleanerRef;
        }

        void setPrevious(CleanerRef cleanerRef) {
            this.previous = cleanerRef;
        }
    }

    private class CleanerThread extends Thread {
        private static final long CLEANER_LINGER_TIME = 30000;

        public CleanerThread() {
            super("JNA Cleaner");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Reference referenceRemove = Cleaner.this.referenceQueue.remove(30000L);
                    if (referenceRemove instanceof CleanerRef) {
                        ((CleanerRef) referenceRemove).clean();
                    } else if (referenceRemove == null) {
                        synchronized (Cleaner.this.referenceQueue) {
                            try {
                                Logger logger = Logger.getLogger(Cleaner.class.getName());
                                if (Cleaner.this.firstCleanable == null) {
                                    Cleaner.this.cleanerThread = null;
                                    logger.log(Level.FINE, "Shutting down CleanerThread");
                                } else if (logger.isLoggable(Level.FINER)) {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (CleanerRef cleanerRef = Cleaner.this.firstCleanable; cleanerRef != null; cleanerRef = cleanerRef.next) {
                                        if (sb2.length() != 0) {
                                            sb2.append(", ");
                                        }
                                        sb2.append(cleanerRef.cleanupTask.toString());
                                    }
                                    logger.log(Level.FINER, "Registered Cleaners: {0}", sb2.toString());
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (InterruptedException unused) {
                } catch (Exception e10) {
                    Logger.getLogger(Cleaner.class.getName()).log(Level.SEVERE, (String) null, (Throwable) e10);
                }
            }
        }
    }

    private Cleaner() {
    }

    private synchronized CleanerRef add(CleanerRef cleanerRef) {
        try {
            synchronized (this.referenceQueue) {
                try {
                    CleanerRef cleanerRef2 = this.firstCleanable;
                    if (cleanerRef2 == null) {
                        this.firstCleanable = cleanerRef;
                    } else {
                        cleanerRef.setNext(cleanerRef2);
                        this.firstCleanable.setPrevious(cleanerRef);
                        this.firstCleanable = cleanerRef;
                    }
                    if (this.cleanerThread == null) {
                        Logger.getLogger(Cleaner.class.getName()).log(Level.FINE, "Starting CleanerThread");
                        CleanerThread cleanerThread = new CleanerThread();
                        this.cleanerThread = cleanerThread;
                        cleanerThread.start();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return cleanerRef;
    }

    public static Cleaner getCleaner() {
        return INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean remove(CleanerRef cleanerRef) {
        boolean z10;
        boolean z11;
        try {
            synchronized (this.referenceQueue) {
                try {
                    z10 = true;
                    if (cleanerRef == this.firstCleanable) {
                        this.firstCleanable = cleanerRef.getNext();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (cleanerRef.getPrevious() != null) {
                        cleanerRef.getPrevious().setNext(cleanerRef.getNext());
                    }
                    if (cleanerRef.getNext() != null) {
                        cleanerRef.getNext().setPrevious(cleanerRef.getPrevious());
                    }
                    if (cleanerRef.getPrevious() == null && cleanerRef.getNext() == null) {
                        z10 = z11;
                    }
                    cleanerRef.setNext(null);
                    cleanerRef.setPrevious(null);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return z10;
    }

    public synchronized Cleanable register(Object obj, Runnable runnable) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return add(new CleanerRef(this, obj, this.referenceQueue, runnable));
    }
}
