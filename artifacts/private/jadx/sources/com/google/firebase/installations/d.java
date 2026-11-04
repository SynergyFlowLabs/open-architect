package com.google.firebase.installations;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: loaded from: classes5.dex */
class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f123165c = "CrossProcessLock";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f123166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileLock f123167b;

    private d(FileChannel fileChannel, FileLock fileLock) {
        this.f123166a = fileChannel;
        this.f123167b = fileLock;
    }

    static d a(Context context, String str) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new d(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException unused) {
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused2) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException unused4) {
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException unused5) {
            channel = null;
            fileLockLock = null;
        }
    }

    void b() {
        try {
            this.f123167b.release();
            this.f123166a.close();
        } catch (IOException unused) {
        }
    }
}
