package com.google.android.gms.dynamite;

import android.os.Looper;
import androidx.annotation.b0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @b0("DynamiteLoaderV2ClassLoader.class")
    @p0
    private static ClassLoader f107065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("DynamiteLoaderV2ClassLoader.class")
    @p0
    private static Thread f107066b;

    /* JADX WARN: Code duplicated, block: B:58:0x00b3 A[Catch: all -> 0x00ae, PHI: r1
      0x00b3: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v14 java.lang.Thread) binds: [B:7:0x000e, B:51:0x00ab] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #6 {, blocks: (B:4:0x0007, B:6:0x000b, B:8:0x0010, B:50:0x00a9, B:66:0x00c3, B:12:0x0025, B:57:0x00b2, B:58:0x00b3, B:69:0x00c7, B:70:0x00c8, B:59:0x00b4, B:65:0x00c2, B:64:0x00be, B:13:0x0026, B:15:0x0037, B:26:0x0055, B:27:0x005e, B:30:0x006c, B:38:0x0085, B:39:0x008f, B:46:0x00a2, B:48:0x00a7, B:18:0x0049), top: B:85:0x0007, inners: #1, #4 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @p0
    public static synchronized ClassLoader a() {
        SecurityException e10;
        Thread thread;
        ThreadGroup threadGroup;
        if (f107065a == null) {
            Thread thread2 = f107066b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f107066b.getContextClassLoader();
                    } catch (SecurityException e11) {
                        e11.getMessage();
                    }
                }
                f107065a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i11];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i11++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i10 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i10];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i10++;
                                }
                                if (thread == null) {
                                    try {
                                        a aVar = new a(threadGroup, "GmsDynamite");
                                        try {
                                            aVar.setContextClassLoader(null);
                                            aVar.start();
                                            thread = aVar;
                                        } catch (SecurityException e12) {
                                            e10 = e12;
                                            thread = aVar;
                                            e10.getMessage();
                                        }
                                    } catch (SecurityException e13) {
                                        e10 = e13;
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (SecurityException e14) {
                            e10 = e14;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                f107066b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f107066b.getContextClassLoader();
                    }
                }
                f107065a = contextClassLoader;
            }
        }
        return f107065a;
    }
}
