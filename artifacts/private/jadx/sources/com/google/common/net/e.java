package com.google.common.net;

import com.google.common.base.b0;
import com.google.common.base.j0;
import com.google.common.hash.s;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import kotlin.e2;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@com.google.common.net.a
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f119567a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f119568b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char f119569c = '.';

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f119570d = ':';

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final com.google.common.base.e f119571e = com.google.common.base.e.q('.');

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final com.google.common.base.e f119572f = com.google.common.base.e.q(':');

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Inet4Address f119573g = (Inet4Address) g("127.0.0.1");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Inet4Address f119574h = (Inet4Address) g("0.0.0.0");

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f119575a;

        private b() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Inet4Address f119576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Inet4Address f119577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f119578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f119579d;

        public c(@fj.a Inet4Address server, @fj.a Inet4Address client, int port, int flags) {
            boolean z10 = false;
            j0.k(port >= 0 && port <= 65535, "port '%s' is out of range (0 <= port <= 0xffff)", port);
            if (flags >= 0 && flags <= 65535) {
                z10 = true;
            }
            j0.k(z10, "flags '%s' is out of range (0 <= flags <= 0xffff)", flags);
            this.f119576a = (Inet4Address) b0.a(server, e.f119574h);
            this.f119577b = (Inet4Address) b0.a(client, e.f119574h);
            this.f119578c = port;
            this.f119579d = flags;
        }

        public Inet4Address a() {
            return this.f119577b;
        }

        public int b() {
            return this.f119579d;
        }

        public int c() {
            return this.f119578c;
        }

        public Inet4Address d() {
            return this.f119576a;
        }
    }

    private e() {
    }

    public static boolean A(Inet6Address ip) {
        byte[] address = ip.getAddress();
        return address[0] == 32 && address[1] == 2;
    }

    public static boolean B(Inet6Address ip) {
        byte b10;
        if (!ip.isIPv4CompatibleAddress()) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[12] == 0 && address[13] == 0 && address[14] == 0 && ((b10 = address[15]) == 0 || b10 == 1)) ? false : true;
    }

    public static boolean C(String ipString) {
        return z(ipString, null) != null;
    }

    public static boolean D(Inet6Address ip) {
        if (G(ip)) {
            return false;
        }
        byte[] address = ip.getAddress();
        return (address[8] | 3) == 3 && address[9] == 0 && address[10] == 94 && address[11] == -2;
    }

    public static boolean E(String ipString) {
        byte[] bArrZ = z(ipString, null);
        if (bArrZ == null || bArrZ.length != 16) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= 10) {
                for (int i11 = 10; i11 < 12; i11++) {
                    if (bArrZ[i11] != -1) {
                        return false;
                    }
                }
                return true;
            }
            if (bArrZ[i10] != 0) {
                return false;
            }
            i10++;
        }
    }

    public static boolean F(InetAddress address) {
        for (byte b10 : address.getAddress()) {
            if (b10 != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(Inet6Address ip) {
        byte[] address = ip.getAddress();
        int i10 = 4 ^ 0;
        return address[0] == 32 && address[1] == 1 && address[2] == 0 && address[3] == 0;
    }

    public static boolean H(String ipString) {
        return i(ipString, false) != null;
    }

    private static short I(String ipString, int start, int end) {
        int i10 = end - start;
        if (i10 <= 0 || i10 > 4) {
            throw new NumberFormatException();
        }
        int iDigit = 0;
        while (start < end) {
            iDigit = (iDigit << 4) | Character.digit(ipString.charAt(start), 16);
            start++;
        }
        return (short) iDigit;
    }

    private static byte J(String ipString, int start, int end) {
        int i10 = end - start;
        if (i10 <= 0 || i10 > 3) {
            throw new NumberFormatException();
        }
        if (i10 > 1 && ipString.charAt(start) == '0') {
            throw new NumberFormatException();
        }
        int i11 = 0;
        while (start < end) {
            int i12 = i11 * 10;
            int iDigit = Character.digit(ipString.charAt(start), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i11 = i12 + iDigit;
            start++;
        }
        if (i11 <= 255) {
            return (byte) i11;
        }
        throw new NumberFormatException();
    }

    private static String K(Inet6Address ip) {
        NetworkInterface scopedInterface = ip.getScopedInterface();
        if (scopedInterface != null) {
            return "%" + scopedInterface.getName();
        }
        int scopeId = ip.getScopeId();
        if (scopeId == 0) {
            return "";
        }
        return "%" + scopeId;
    }

    @fj.a
    private static byte[] L(String ipString) {
        int i10 = 0 & 4;
        if (f119571e.i(ipString) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int iIndexOf = ipString.indexOf(46, i11);
            if (iIndexOf == -1) {
                iIndexOf = ipString.length();
            }
            try {
                bArr[i12] = J(ipString, i11, iIndexOf);
                i11 = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    @fj.a
    private static byte[] M(String ipString) {
        int i10 = f119572f.i(ipString);
        if (i10 >= 2 && i10 <= 8) {
            int i11 = 1;
            int i12 = i10 + 1;
            int i13 = 8 - i12;
            boolean z10 = false;
            for (int i14 = 0; i14 < ipString.length() - 1; i14++) {
                if (ipString.charAt(i14) == ':' && ipString.charAt(i14 + 1) == ':') {
                    if (z10) {
                        return null;
                    }
                    int i15 = i13 + 1;
                    if (i14 == 0) {
                        i15 = i13 + 2;
                    }
                    if (i14 == ipString.length() - 2) {
                        i15++;
                    }
                    i13 = i15;
                    z10 = true;
                }
            }
            if (ipString.charAt(0) == ':' && ipString.charAt(1) != ':') {
                return null;
            }
            if (ipString.charAt(ipString.length() - 1) == ':' && ipString.charAt(ipString.length() - 2) != ':') {
                return null;
            }
            if (z10 && i13 <= 0) {
                return null;
            }
            if (!z10 && i12 != 8) {
                return null;
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            try {
                if (ipString.charAt(0) != ':') {
                    i11 = 0;
                }
                while (i11 < ipString.length()) {
                    int iIndexOf = ipString.indexOf(58, i11);
                    if (iIndexOf == -1) {
                        iIndexOf = ipString.length();
                    }
                    if (ipString.charAt(i11) == ':') {
                        for (int i16 = 0; i16 < i13; i16++) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                    } else {
                        byteBufferAllocate.putShort(I(ipString, i11, iIndexOf));
                    }
                    i11 = iIndexOf + 1;
                }
                return byteBufferAllocate.array();
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String N(InetAddress ip) {
        j0.E(ip);
        if (ip instanceof Inet4Address) {
            String hostAddress = ip.getHostAddress();
            Objects.requireNonNull(hostAddress);
            return hostAddress;
        }
        byte[] address = ip.getAddress();
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = i10 * 2;
            iArr[i10] = com.google.common.primitives.l.l((byte) 0, (byte) 0, address[i11], address[i11 + 1]);
        }
        d(iArr);
        return x(iArr) + K((Inet6Address) ip);
    }

    public static BigInteger O(InetAddress address) {
        return new BigInteger(1, address.getAddress());
    }

    public static String P(InetAddress ip) {
        if (!(ip instanceof Inet6Address)) {
            return N(ip);
        }
        return "[" + N(ip) + "]";
    }

    private static int Q(String string, int start, int end) {
        int i10 = 0;
        while (start < end) {
            if (i10 > 214748364) {
                return -1;
            }
            int i11 = i10 * 10;
            int iDigit = Character.digit(string.charAt(start), 10);
            if (iDigit < 0) {
                return -1;
            }
            i10 = i11 + iDigit;
            start++;
        }
        return i10;
    }

    private static InetAddress b(byte[] addr, String scope) {
        try {
            InetAddress byAddress = InetAddress.getByAddress(addr);
            if (scope == null) {
                return byAddress;
            }
            j0.e(byAddress instanceof Inet6Address, "Unexpected state, scope should only appear for ipv6");
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int iQ = Q(scope, 0, scope.length());
            if (iQ != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), iQ);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(scope);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                throw j("No such interface: '%s'", scope);
            } catch (SocketException | UnknownHostException e10) {
                throw new IllegalArgumentException("No such interface: " + scope, e10);
            }
        } catch (UnknownHostException e11) {
            throw new AssertionError(e11);
        }
    }

    public static int c(InetAddress ip) {
        return com.google.common.io.h.h(q(ip).getAddress()).readInt();
    }

    private static void d(int[] hextets) {
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < hextets.length + 1; i13++) {
            if (i13 >= hextets.length || hextets[i13] != 0) {
                if (i12 >= 0) {
                    int i14 = i13 - i12;
                    if (i14 > i10) {
                        i11 = i12;
                        i10 = i14;
                    }
                    i12 = -1;
                }
            } else if (i12 < 0) {
                i12 = i13;
            }
        }
        if (i10 >= 2) {
            Arrays.fill(hextets, i11, i10 + i11, -1);
        }
    }

    @fj.a
    private static String e(String ipString) {
        int iLastIndexOf = ipString.lastIndexOf(58) + 1;
        String strSubstring = ipString.substring(0, iLastIndexOf);
        byte[] bArrL = L(ipString.substring(iLastIndexOf));
        if (bArrL == null) {
            return null;
        }
        return strSubstring + Integer.toHexString(((bArrL[0] & 255) << 8) | (bArrL[1] & 255)) + ":" + Integer.toHexString((bArrL[3] & 255) | ((bArrL[2] & 255) << 8));
    }

    public static InetAddress f(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (length >= 0 && address2[length] == 0) {
            address2[length] = -1;
            length--;
        }
        j0.u(length >= 0, "Decrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] - 1);
        return b(address2, null);
    }

    @z7.a
    public static InetAddress g(String ipString) {
        b bVar = new b();
        byte[] bArrZ = z(ipString, bVar);
        if (bArrZ != null) {
            return b(bArrZ, bVar.f119575a);
        }
        throw j("'%s' is not an IP string literal.", ipString);
    }

    public static InetAddress h(String hostAddr) {
        InetAddress inetAddressI = i(hostAddr, true);
        if (inetAddressI != null) {
            return inetAddressI;
        }
        throw j("Not a valid URI IP literal: '%s'", hostAddr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @fj.a
    private static InetAddress i(String str, boolean z10) {
        int i10;
        j0.E(str);
        if (str.startsWith("[") && str.endsWith("]")) {
            str = str.substring(1, str.length() - 1);
            i10 = 16;
        } else {
            i10 = 4;
        }
        b bVar = z10 ? new b() : null;
        byte[] bArrZ = z(str, bVar);
        if (bArrZ == null || bArrZ.length != i10) {
            return null;
        }
        return b(bArrZ, bVar != null ? bVar.f119575a : null);
    }

    private static IllegalArgumentException j(String format, Object... args) {
        return new IllegalArgumentException(String.format(Locale.ROOT, format, args));
    }

    private static InetAddress k(BigInteger address, boolean isIpv6) {
        j0.e(address.signum() >= 0, "BigInteger must be greater than or equal to 0");
        int i10 = isIpv6 ? 16 : 4;
        byte[] byteArray = address.toByteArray();
        byte[] bArr = new byte[i10];
        int iMax = Math.max(0, byteArray.length - i10);
        int length = byteArray.length - iMax;
        int i11 = i10 - length;
        for (int i12 = 0; i12 < iMax; i12++) {
            if (byteArray[i12] != 0) {
                throw j("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", Integer.valueOf(i10), address);
            }
        }
        System.arraycopy(byteArray, iMax, bArr, i11, length);
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException e10) {
            throw new AssertionError(e10);
        }
    }

    public static Inet4Address l(BigInteger address) {
        return (Inet4Address) k(address, false);
    }

    public static Inet6Address m(BigInteger address) {
        return (Inet6Address) k(address, true);
    }

    public static Inet4Address n(int address) {
        return t(com.google.common.primitives.l.F(address));
    }

    public static InetAddress o(byte[] addr) throws UnknownHostException {
        byte[] bArr = new byte[addr.length];
        for (int i10 = 0; i10 < addr.length; i10++) {
            bArr[i10] = addr[(addr.length - i10) - 1];
        }
        return InetAddress.getByAddress(bArr);
    }

    public static Inet4Address p(Inet6Address ip) {
        j0.u(A(ip), "Address '%s' is not a 6to4 address.", N(ip));
        return t(Arrays.copyOfRange(ip.getAddress(), 2, 6));
    }

    public static Inet4Address q(InetAddress ip) {
        boolean z10;
        if (ip instanceof Inet4Address) {
            return (Inet4Address) ip;
        }
        byte[] address = ip.getAddress();
        int i10 = 0;
        while (true) {
            if (i10 >= 15) {
                z10 = true;
                break;
            }
            if (address[i10] != 0) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10 && address[15] == 1) {
            return f119573g;
        }
        if (z10 && address[15] == 0) {
            return f119574h;
        }
        Inet6Address inet6Address = (Inet6Address) ip;
        int iB = s.B().e(w(inet6Address) ? s(inet6Address).hashCode() : ByteBuffer.wrap(inet6Address.getAddress(), 0, 8).getLong()).b() | (-536870912);
        if (iB == -1) {
            iB = -2;
        }
        return t(com.google.common.primitives.l.F(iB));
    }

    public static Inet4Address r(Inet6Address ip) {
        j0.u(B(ip), "Address '%s' is not IPv4-compatible.", N(ip));
        return t(Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static Inet4Address s(Inet6Address ip) {
        if (B(ip)) {
            return r(ip);
        }
        if (A(ip)) {
            return p(ip);
        }
        if (G(ip)) {
            return v(ip).a();
        }
        throw j("'%s' has no embedded IPv4 address.", N(ip));
    }

    private static Inet4Address t(byte[] bytes) {
        j0.k(bytes.length == 4, "Byte array has invalid length for an IPv4 address: %s != 4.", bytes.length);
        return (Inet4Address) b(bytes, null);
    }

    public static Inet4Address u(Inet6Address ip) {
        j0.u(D(ip), "Address '%s' is not an ISATAP address.", N(ip));
        return t(Arrays.copyOfRange(ip.getAddress(), 12, 16));
    }

    public static c v(Inet6Address ip) {
        j0.u(G(ip), "Address '%s' is not a Teredo address.", N(ip));
        byte[] address = ip.getAddress();
        Inet4Address inet4AddressT = t(Arrays.copyOfRange(address, 4, 8));
        int i10 = com.google.common.io.h.i(address, 8).readShort() & e2.f312492d;
        int i11 = 65535 & (~com.google.common.io.h.i(address, 10).readShort());
        byte[] bArrCopyOfRange = Arrays.copyOfRange(address, 12, 16);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) (~bArrCopyOfRange[i12]);
        }
        return new c(inet4AddressT, t(bArrCopyOfRange), i11, i10);
    }

    public static boolean w(Inet6Address ip) {
        return B(ip) || A(ip) || G(ip);
    }

    private static String x(int[] hextets) {
        StringBuilder sb2 = new StringBuilder(39);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < hextets.length) {
            boolean z11 = hextets[i10] >= 0;
            if (z11) {
                if (z10) {
                    sb2.append(':');
                }
                sb2.append(Integer.toHexString(hextets[i10]));
            } else if (i10 == 0 || z10) {
                sb2.append("::");
            }
            i10++;
            z10 = z11;
        }
        return sb2.toString();
    }

    public static InetAddress y(InetAddress address) {
        byte[] address2 = address.getAddress();
        int length = address2.length - 1;
        while (true) {
            if (length < 0 || address2[length] != -1) {
                break;
            }
            address2[length] = 0;
            length--;
        }
        j0.u(length >= 0, "Incrementing %s would wrap.", address);
        address2[length] = (byte) (address2[length] + 1);
        return b(address2, null);
    }

    @fj.a
    private static byte[] z(String ipStringParam, b scope) {
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (i10 >= ipStringParam.length()) {
                i10 = -1;
                break;
            }
            char cCharAt = ipStringParam.charAt(i10);
            if (cCharAt == '.') {
                z10 = true;
            } else if (cCharAt == ':') {
                if (z10) {
                    return null;
                }
                z11 = true;
            } else {
                if (cCharAt == '%') {
                    break;
                }
                if (Character.digit(cCharAt, 16) == -1) {
                    return null;
                }
            }
            i10++;
        }
        if (!z11) {
            if (z10 && i10 == -1) {
                return L(ipStringParam);
            }
            return null;
        }
        if (z10 && (ipStringParam = e(ipStringParam)) == null) {
            return null;
        }
        if (i10 != -1) {
            if (scope != null) {
                scope.f119575a = ipStringParam.substring(i10 + 1);
            }
            ipStringParam = ipStringParam.substring(0, i10);
        }
        return M(ipStringParam);
    }
}
