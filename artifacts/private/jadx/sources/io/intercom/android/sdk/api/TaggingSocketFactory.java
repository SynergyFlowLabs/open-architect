package io.intercom.android.sdk.api;

import android.net.TrafficStats;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;

/* JADX INFO: loaded from: classes13.dex */
public class TaggingSocketFactory extends SocketFactory {
    private final SocketFactory defaultFactory;
    private final int threadStatsTag;

    public TaggingSocketFactory(SocketFactory socketFactory, int i10) {
        this.defaultFactory = socketFactory;
        this.threadStatsTag = i10;
    }

    private Socket withTag(Socket socket) throws IOException {
        TrafficStats.setThreadStatsTag(this.threadStatsTag);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return withTag(this.defaultFactory.createSocket());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return withTag(this.defaultFactory.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return withTag(this.defaultFactory.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return withTag(this.defaultFactory.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return withTag(this.defaultFactory.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
