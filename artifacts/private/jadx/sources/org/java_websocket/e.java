package org.java_websocket;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* JADX INFO: loaded from: classes14.dex */
public class e {
    private e() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean a(i iVar, ByteChannel byteChannel) throws IOException {
        l lVar;
        if (iVar == null) {
            return false;
        }
        ByteBuffer byteBufferPeek = iVar.f337904b.peek();
        if (byteBufferPeek == null) {
            if (byteChannel instanceof l) {
                lVar = (l) byteChannel;
                if (lVar.y4()) {
                    lVar.rb();
                }
            }
            if (iVar.f337904b.isEmpty() && iVar.e() && iVar.w() != null && iVar.w().o() != null && iVar.w().o() == em.e.SERVER) {
                iVar.h();
            }
            return (lVar == null && ((l) byteChannel).y4()) ? false : true;
        }
        do {
            byteChannel.write(byteBufferPeek);
            if (byteBufferPeek.remaining() > 0) {
                return false;
            }
            iVar.f337904b.poll();
            byteBufferPeek = iVar.f337904b.peek();
        } while (byteBufferPeek != null);
        lVar = null;
        if (iVar.f337904b.isEmpty()) {
            iVar.h();
        }
        if (lVar == null) {
        }
    }

    public static boolean b(ByteBuffer byteBuffer, i iVar, ByteChannel byteChannel) throws IOException {
        byteBuffer.clear();
        int i10 = byteChannel.read(byteBuffer);
        byteBuffer.flip();
        if (i10 != -1) {
            return i10 != 0;
        }
        iVar.u();
        return false;
    }

    public static boolean c(ByteBuffer byteBuffer, i iVar, l lVar) throws IOException {
        byteBuffer.clear();
        int iYb = lVar.yb(byteBuffer);
        byteBuffer.flip();
        if (iYb != -1) {
            return lVar.K4();
        }
        iVar.u();
        return false;
    }
}
