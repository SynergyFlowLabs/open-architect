package com.google.android.filament.utils;

import androidx.annotation.p0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteServer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104806a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f104807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ByteBuffer f104808b;
    }

    public RemoteServer(int i10) {
        long jNCreate = nCreate(i10);
        this.f104806a = jNCreate;
        if (jNCreate == 0) {
            throw new IllegalStateException("Couldn't create RemoteServer");
        }
    }

    public static boolean c(@p0 String str) {
        return (str == null || str.endsWith(".json")) ? false : true;
    }

    public static boolean d(@p0 String str) {
        return str != null && str.endsWith(".json");
    }

    private static native void nAcquireReceivedMessage(long j10, ByteBuffer byteBuffer, int i10);

    private static native long nCreate(int i10);

    private static native void nDestroy(long j10);

    private static native String nPeekIncomingLabel(long j10);

    private static native int nPeekReceivedBufferLength(long j10);

    private static native String nPeekReceivedLabel(long j10);

    @p0
    public a a() {
        int iNPeekReceivedBufferLength = nPeekReceivedBufferLength(this.f104806a);
        if (iNPeekReceivedBufferLength == 0) {
            return null;
        }
        a aVar = new a();
        aVar.f104807a = nPeekReceivedLabel(this.f104806a);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iNPeekReceivedBufferLength);
        aVar.f104808b = byteBufferAllocateDirect;
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        nAcquireReceivedMessage(this.f104806a, aVar.f104808b, iNPeekReceivedBufferLength);
        return aVar;
    }

    public void b() {
        nDestroy(this.f104806a);
        this.f104806a = 0L;
    }

    @p0
    public String e() {
        return nPeekIncomingLabel(this.f104806a);
    }

    protected void finalize() throws Throwable {
        nDestroy(this.f104806a);
        super.finalize();
    }
}
