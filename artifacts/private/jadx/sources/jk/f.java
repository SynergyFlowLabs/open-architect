package jk;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.g3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.q1;
import kotlin.jvm.internal.r1;
import kotlin.p;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.i;
import okhttp3.b0;
import okhttp3.e0;
import okhttp3.f0;
import okhttp3.g0;
import okhttp3.u;
import okhttp3.v;
import okio.b1;
import okio.n;
import okio.o;
import okio.p0;
import okio.z0;
import org.apache.commons.lang3.time.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,636:1\n37#2,2:637\n1627#3,6:639\n1#4:645\n1549#5:646\n1620#5,3:647\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokhttp3/internal/Util\n*L\n127#1:637,2\n167#1:639,6\n300#1:646\n300#1:647,3\n*E\n"})
@i(name = "Util")
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final byte[] f307483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final u f307484b = u.f334769b.j(new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final g0 f307485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final e0 f307486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final p0 f307487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final TimeZone f307488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final Regex f307489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oj.f
    public static final boolean f307490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f307491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final String f307492j = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        f307483a = bArr;
        f307485c = g0.b.l(g0.Companion, bArr, null, 1, null);
        f307486d = e0.a.r(e0.Companion, bArr, null, 0, 0, 7, null);
        p0.a aVar = p0.f335056c;
        o.a aVar2 = o.f335046d;
        f307487e = aVar.d(aVar2.i("efbbbf"), aVar2.i("feff"), aVar2.i("fffe"), aVar2.i("0000ffff"), aVar2.i("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone(m.f337525a);
        Intrinsics.checkNotNull(timeZone);
        f307488f = timeZone;
        f307489g = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f307490h = false;
        String name = b0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f307491i = StringsKt.j4(StringsKt.d4(name, "okhttp3."), "Client");
    }

    public static final long A(@NotNull f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        String strK = f0Var.Y().k("Content-Length");
        return strK != null ? j0(strK, -1L) : -1L;
    }

    public static final void B(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    @NotNull
    public static final <T> List<T> C(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int D(@NotNull String[] strArr, @NotNull String value, @NotNull Comparator<String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int E(@NotNull String str) {
        int i10;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            i10 = (Intrinsics.compare((int) cCharAt, 31) > 0 && Intrinsics.compare((int) cCharAt, 127) < 0) ? i10 + 1 : 0;
            return i10;
        }
        return -1;
    }

    public static final int F(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int G(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return F(str, i10, i11);
    }

    public static final int H(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 != i10) {
                    i12--;
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ int I(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return H(str, i10, i11);
    }

    public static final int J(@NotNull String str, int i10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static /* synthetic */ int K(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return J(str, i10);
    }

    @NotNull
    public static final String[] L(@NotNull String[] strArr, @NotNull String[] other, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : other) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean M(@NotNull okhttp3.internal.io.a aVar, @NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        z0 z0VarH = aVar.h(file);
        try {
            try {
                aVar.c(file);
                kotlin.io.c.a(z0VarH, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(z0VarH, null);
                aVar.c(file);
                return false;
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(z0VarH, th2);
                throw th3;
            }
        }
    }

    public static final boolean N(@NotNull Socket socket, @NotNull n source) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.y1();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean O(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!StringsKt.N1(name, "Authorization", true) && !StringsKt.N1(name, "Cookie", true) && !StringsKt.N1(name, "Proxy-Authorization", true) && !StringsKt.N1(name, com.google.common.net.d.F0, true)) {
            return false;
        }
        return true;
    }

    public static final void P(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.notify();
    }

    public static final void Q(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.notifyAll();
    }

    public static final int R(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - l.f338160j;
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    @NotNull
    public static final String S(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        Intrinsics.checkNotNullExpressionValue(hostName, "address.hostName");
        return hostName;
    }

    @NotNull
    public static final Charset T(@NotNull n nVar, @NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        Intrinsics.checkNotNullParameter(charset, "default");
        int iXf = nVar.xf(f307487e);
        if (iXf == -1) {
            return charset;
        }
        if (iXf == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iXf == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iXf == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iXf == 3) {
            return Charsets.f313184a.b();
        }
        if (iXf == 4) {
            return Charsets.f313184a.c();
        }
        throw new AssertionError();
    }

    @Nullable
    public static final <T> T U(@NotNull Object instance, @NotNull Class<T> fieldType, @NotNull String fieldName) throws IllegalAccessException {
        Object objU;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(fieldType, "fieldType");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            T tCast = null;
            if (Intrinsics.areEqual(superclass, Object.class)) {
                if (Intrinsics.areEqual(fieldName, "delegate") || (objU = U(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) U(objU, fieldType, fieldName);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (fieldType.isInstance(obj)) {
                    tCast = fieldType.cast(obj);
                }
                return tCast;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                Intrinsics.checkNotNullExpressionValue(superclass, "c.superclass");
            }
        }
    }

    public static final int V(@NotNull n nVar) throws IOException {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return d(nVar.readByte(), 255) | (d(nVar.readByte(), 255) << 16) | (d(nVar.readByte(), 255) << 8);
    }

    public static final int W(@NotNull okio.l lVar, byte b10) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int i10 = 0;
        while (!lVar.y1() && lVar.I(0L) == b10) {
            i10++;
            lVar.readByte();
        }
        return i10;
    }

    public static final boolean X(@NotNull b1 b1Var, int i10, @NotNull TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jF = b1Var.timeout().h() ? b1Var.timeout().f() - jNanoTime : Long.MAX_VALUE;
        b1Var.timeout().g(Math.min(jF, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            okio.l lVar = new okio.l();
            while (b1Var.read(lVar, PlaybackStateCompat.f9665p2) != -1) {
                lVar.c();
            }
            if (jF == Long.MAX_VALUE) {
                b1Var.timeout().c();
                return true;
            }
            b1Var.timeout().g(jNanoTime + jF);
            return true;
        } catch (InterruptedIOException unused) {
            if (jF == Long.MAX_VALUE) {
                b1Var.timeout().c();
            } else {
                b1Var.timeout().g(jNanoTime + jF);
            }
            return false;
        } catch (Throwable th2) {
            if (jF == Long.MAX_VALUE) {
                b1Var.timeout().c();
            } else {
                b1Var.timeout().g(jNanoTime + jF);
            }
            throw th2;
        }
    }

    @NotNull
    public static final ThreadFactory Y(@NotNull final String name, final boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ThreadFactory() { // from class: jk.e
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return f.Z(name, z10, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread Z(String name, boolean z10, Runnable runnable) {
        Intrinsics.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final void a0(@NotNull String name, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(block, "block");
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        threadCurrentThread.setName(name);
        try {
            block.invoke();
            h0.d(1);
        } finally {
            h0.d(1);
            threadCurrentThread.setName(name2);
            h0.c(1);
        }
    }

    @NotNull
    public static final List<okhttp3.internal.http2.c> b0(@NotNull u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        IntRange intRangeW1 = r.W1(0, uVar.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
        Iterator<Integer> it = intRangeW1.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new okhttp3.internal.http2.c(uVar.n(iNextInt), uVar.w(iNextInt)));
        }
        return arrayList;
    }

    public static final <E> void c(@NotNull List<E> list, E e10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    @NotNull
    public static final u c0(@NotNull List<okhttp3.internal.http2.c> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        u.a aVar = new u.a();
        for (okhttp3.internal.http2.c cVar : list) {
            aVar.g(cVar.a().G0(), cVar.b().G0());
        }
        return aVar.i();
    }

    public static final int d(byte b10, int i10) {
        return b10 & i10;
    }

    @NotNull
    public static final String d0(int i10) {
        String hexString = Integer.toHexString(i10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final int e(short s10, int i10) {
        return s10 & i10;
    }

    @NotNull
    public static final String e0(long j10) {
        String hexString = Long.toHexString(j10);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long f(int i10, long j10) {
        return ((long) i10) & j10;
    }

    @NotNull
    public static final String f0(@NotNull v vVar, boolean z10) {
        String strF;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        int i10 = 7 << 0;
        if (StringsKt.V2(vVar.F(), ":", false, 2, null)) {
            strF = AbstractJsonLexerKt.BEGIN_LIST + vVar.F() + AbstractJsonLexerKt.END_LIST;
        } else {
            strF = vVar.F();
        }
        if (!z10 && vVar.N() == v.f334772k.g(vVar.X())) {
            return strF;
        }
        return strF + AbstractJsonLexerKt.COLON + vVar.N();
    }

    @NotNull
    public static final okhttp3.r.c g(@NotNull final okhttp3.r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return new okhttp3.r.c() { // from class: jk.d
            @Override // okhttp3.r.c
            public final okhttp3.r a(okhttp3.e eVar) {
                return f.h(rVar, eVar);
            }
        };
    }

    public static /* synthetic */ String g0(v vVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return f0(vVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final okhttp3.r h(okhttp3.r this_asFactory, okhttp3.e it) {
        Intrinsics.checkNotNullParameter(this_asFactory, "$this_asFactory");
        Intrinsics.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    @NotNull
    public static final <T> List<T> h0(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final void i(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (f307490h && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> i0(@NotNull Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final void j(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (!f307490h || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final long j0(@NotNull String str, long j10) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final boolean k(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return f307489g.k(str);
    }

    public static final int k0(@Nullable String str, int i10) {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > g3.f12256c) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final boolean l(@NotNull v vVar, @NotNull v other) {
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(vVar.F(), other.F()) && vVar.N() == other.N() && Intrinsics.areEqual(vVar.X(), other.X());
    }

    @NotNull
    public static final String l0(@NotNull String str, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iF = F(str, i10, i11);
        String strSubstring = str.substring(iF, H(str, iF, i11));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final int m(@NotNull String name, long j10, @Nullable TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > g3.f12256c) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static /* synthetic */ String m0(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return l0(str, i10, i11);
    }

    public static final void n(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void n0(@NotNull Object obj) throws InterruptedException {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        obj.wait();
    }

    public static final void o(@NotNull Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final Throwable o0(@NotNull Exception exc, @NotNull List<? extends Exception> suppressed) {
        Intrinsics.checkNotNullParameter(exc, "<this>");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            p.a(exc, it.next());
        }
        return exc;
    }

    public static final void p(@NotNull ServerSocket serverSocket) {
        Intrinsics.checkNotNullParameter(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void p0(@NotNull okio.m mVar, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        mVar.writeByte((i10 >>> 16) & 255);
        mVar.writeByte((i10 >>> 8) & 255);
        mVar.writeByte(i10 & 255);
    }

    public static final void q(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.areEqual(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final String[] r(@NotNull String[] strArr, @NotNull String value) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static final int s(@NotNull String str, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int t(@NotNull String str, @NotNull String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.U2(delimiters, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int u(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return s(str, c10, i10, i11);
    }

    public static /* synthetic */ int v(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return t(str, str2, i10, i11);
    }

    public static final boolean w(@NotNull b1 b1Var, int i10, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return X(b1Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    @NotNull
    public static final <T> List<T> x(@NotNull Iterable<? extends T> iterable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        List<T> listEmptyList = CollectionsKt.emptyList();
        for (T t10 : iterable) {
            if (predicate.invoke(t10).booleanValue()) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                r1.g(listEmptyList).add(t10);
            }
        }
        return listEmptyList;
    }

    @NotNull
    public static final String y(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        q1 q1Var = q1.f312784a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean z(@NotNull String[] strArr, @Nullable String[] strArr2, @NotNull Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = kotlin.jvm.internal.i.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
