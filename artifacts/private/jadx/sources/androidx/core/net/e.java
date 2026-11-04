package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import androidx.annotation.w0;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    @w0(24)
    static class a {
        private a() {
        }

        static void a(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.tagDatagramSocket(datagramSocket);
        }

        static void b(DatagramSocket datagramSocket) throws SocketException {
            TrafficStats.untagDatagramSocket(datagramSocket);
        }
    }

    private e() {
    }

    @Deprecated
    public static void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int b() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void c(int i10) {
        TrafficStats.incrementOperationCount(i10);
    }

    @Deprecated
    public static void d(int i10, int i11) {
        TrafficStats.incrementOperationCount(i10, i11);
    }

    @Deprecated
    public static void e(int i10) {
        TrafficStats.setThreadStatsTag(i10);
    }

    public static void f(@NonNull DatagramSocket datagramSocket) throws SocketException {
        a.a(datagramSocket);
    }

    @Deprecated
    public static void g(Socket socket) throws SocketException {
        TrafficStats.tagSocket(socket);
    }

    public static void h(@NonNull DatagramSocket datagramSocket) throws SocketException {
        a.b(datagramSocket);
    }

    @Deprecated
    public static void i(Socket socket) throws SocketException {
        TrafficStats.untagSocket(socket);
    }
}
