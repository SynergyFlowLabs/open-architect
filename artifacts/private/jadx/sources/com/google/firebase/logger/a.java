package com.google.firebase.logger;

import android.util.Log;
import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q1;
import kotlin.k0;
import kotlin.text.StringsKt;
import oj.j;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f123314d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final ConcurrentHashMap<String, a> f123315e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f123316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f123317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private d f123318c;

    /* JADX INFO: renamed from: com.google.firebase.logger.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$AndroidLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    private static final class C1171a extends a {

        /* JADX INFO: renamed from: com.google.firebase.logger.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1172a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f123319a;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    int i10 = 2 ^ 1;
                    iArr[d.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[d.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f123319a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1171a(@NotNull String tag, boolean z10, @NotNull d minLevel) {
            super(tag, z10, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        }

        @Override // com.google.firebase.logger.a
        public int x(@NotNull d level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (args.length != 0) {
                q1 q1Var = q1.f312784a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            }
            int i10 = C1172a.f123319a[level.ordinal()];
            if (i10 == 1) {
                String strQ = q();
                return th2 != null ? Log.v(strQ, format, th2) : Log.v(strQ, format);
            }
            if (i10 == 2) {
                String strQ2 = q();
                return th2 != null ? Log.d(strQ2, format, th2) : Log.d(strQ2, format);
            }
            if (i10 == 3) {
                String strQ3 = q();
                return th2 != null ? Log.i(strQ3, format, th2) : Log.i(strQ3, format);
            }
            if (i10 == 4) {
                String strQ4 = q();
                return th2 != null ? Log.w(strQ4, format, th2) : Log.w(strQ4, format);
            }
            if (i10 != 5) {
                throw new k0();
            }
            String strQ5 = q();
            return th2 != null ? Log.e(strQ5, format, th2) : Log.e(strQ5, format);
        }
    }

    @SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n72#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n*L\n180#1:197,2\n180#1:199\n*E\n"})
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ a b(b bVar, String str, boolean z10, d dVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                dVar = d.INFO;
            }
            return bVar.a(str, z10, dVar);
        }

        public static /* synthetic */ c d(b bVar, String str, boolean z10, d dVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                dVar = d.DEBUG;
            }
            return bVar.c(str, z10, dVar);
        }

        @n
        @NotNull
        public final a a(@NotNull String tag, boolean z10, @NotNull d minLevel) {
            Object objPutIfAbsent;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = a.f123315e;
            Object c1171a = concurrentHashMap.get(tag);
            if (c1171a == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (c1171a = new C1171a(tag, z10, minLevel)))) != null) {
                c1171a = objPutIfAbsent;
            }
            Intrinsics.checkNotNullExpressionValue(c1171a, "getOrPut(...)");
            return (a) c1171a;
        }

        @n
        @l1
        @NotNull
        public final c c(@NotNull String tag, boolean z10, @NotNull d minLevel) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            c cVar = new c(tag, z10, minLevel);
            a.f123315e.put(tag, cVar);
            return cVar;
        }

        private b() {
        }
    }

    @l1
    @SourceDebugExtension({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1755#2,3:197\n1755#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n*L\n144#1:197,3\n148#1:200,3\n*E\n"})
    public static final class c extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        private final List<String> f123320f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull String tag, boolean z10, @NotNull d minLevel) {
            super(tag, z10, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            this.f123320f = new ArrayList();
        }

        private final String S(d dVar, String str, Object[] objArr, Throwable th2) {
            if (objArr.length != 0) {
                q1 q1Var = q1.f312784a;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                str = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            if (th2 != null) {
                String str2 = dVar + ' ' + str + ' ' + Log.getStackTraceString(th2);
                if (str2 != null) {
                    return str2;
                }
            }
            return dVar + ' ' + str;
        }

        @l1
        public final void P() {
            this.f123320f.clear();
        }

        @l1
        public final boolean Q(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            List<String> list = this.f123320f;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.V2((String) it.next(), message, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l1
        public final boolean R(@NotNull Function1<? super String, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            List<String> list = this.f123320f;
            int i10 = 6 ^ 0;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.a
        public int x(@NotNull d level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable th2) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            String strS = S(level, format, args, th2);
            System.out.println((Object) ("Log: " + strS));
            this.f123320f.add(strS);
            return strS.length();
        }
    }

    public enum d {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f123327h = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f123328a;

        d(int i10) {
            this.f123328a = i10;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f123327h;
        }

        public final int n() {
            return this.f123328a;
        }
    }

    public /* synthetic */ a(String str, boolean z10, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, dVar);
    }

    @n
    @l1
    @NotNull
    public static final c C(@NotNull String str, boolean z10, @NotNull d dVar) {
        return f123314d.c(str, z10, dVar);
    }

    public static /* synthetic */ int H(a aVar, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return aVar.E(str, th2);
    }

    public static /* synthetic */ int I(a aVar, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return aVar.G(str, objArr, th2);
    }

    public static /* synthetic */ int N(a aVar, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return aVar.K(str, th2);
    }

    public static /* synthetic */ int O(a aVar, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return aVar.M(str, objArr, th2);
    }

    public static /* synthetic */ int f(a aVar, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return aVar.c(str, th2);
    }

    public static /* synthetic */ int g(a aVar, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return aVar.e(str, objArr, th2);
    }

    public static /* synthetic */ int l(a aVar, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
            int i11 = 3 >> 0;
        }
        return aVar.i(str, th2);
    }

    public static /* synthetic */ int m(a aVar, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
            int i11 = 0 << 0;
        }
        return aVar.k(str, objArr, th2);
    }

    @n
    @NotNull
    public static final a o(@NotNull String str, boolean z10, @NotNull d dVar) {
        return f123314d.a(str, z10, dVar);
    }

    public static /* synthetic */ int v(a aVar, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return aVar.s(str, th2);
    }

    public static /* synthetic */ int w(a aVar, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return aVar.u(str, objArr, th2);
    }

    private final int y(d dVar, String str, Object[] objArr, Throwable th2) {
        if (!this.f123317b) {
            return 0;
        }
        if (this.f123318c.n() <= dVar.n() || Log.isLoggable(this.f123316a, dVar.n())) {
            return x(dVar, str, objArr, th2);
        }
        return 0;
    }

    static /* synthetic */ int z(a aVar, d dVar, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i10 & 4) != 0) {
            objArr = new Object[0];
        }
        return aVar.y(dVar, str, objArr, th2);
    }

    public final void A(boolean z10) {
        this.f123317b = z10;
    }

    public final void B(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        this.f123318c = dVar;
    }

    @j
    public final int D(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return H(this, msg, null, 2, null);
    }

    @j
    public final int E(@NotNull String msg, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return z(this, d.VERBOSE, msg, null, th2, 4, null);
    }

    @j
    public final int F(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return I(this, format, args, null, 4, null);
    }

    @j
    public final int G(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return y(d.VERBOSE, format, args, th2);
    }

    @j
    public final int J(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return N(this, msg, null, 2, null);
    }

    @j
    public final int K(@NotNull String msg, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return z(this, d.WARN, msg, null, th2, 4, null);
    }

    @j
    public final int L(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        int i10 = 4 & 0;
        return O(this, format, args, null, 4, null);
    }

    @j
    public final int M(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return y(d.WARN, format, args, th2);
    }

    @j
    public final int b(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return f(this, msg, null, 2, null);
    }

    @j
    public final int c(@NotNull String msg, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return z(this, d.DEBUG, msg, null, th2, 4, null);
    }

    @j
    public final int d(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        int i10 = 6 & 0;
        return g(this, format, args, null, 4, null);
    }

    @j
    public final int e(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return y(d.DEBUG, format, args, th2);
    }

    @j
    public final int h(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return l(this, msg, null, 2, null);
    }

    @j
    public final int i(@NotNull String msg, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return z(this, d.ERROR, msg, null, th2, 4, null);
    }

    @j
    public final int j(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return m(this, format, args, null, 4, null);
    }

    @j
    public final int k(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return y(d.ERROR, format, args, th2);
    }

    public final boolean n() {
        return this.f123317b;
    }

    @NotNull
    public final d p() {
        return this.f123318c;
    }

    @NotNull
    public final String q() {
        return this.f123316a;
    }

    @j
    public final int r(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return v(this, msg, null, 2, null);
    }

    @j
    public final int s(@NotNull String msg, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return z(this, d.INFO, msg, null, th2, 4, null);
    }

    @j
    public final int t(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return w(this, format, args, null, 4, null);
    }

    @j
    public final int u(@NotNull String format, @NotNull Object[] args, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return y(d.INFO, format, args, th2);
    }

    public abstract int x(@NotNull d dVar, @NotNull String str, @NotNull Object[] objArr, @Nullable Throwable th2);

    private a(String str, boolean z10, d dVar) {
        this.f123316a = str;
        this.f123317b = z10;
        this.f123318c = dVar;
    }
}
