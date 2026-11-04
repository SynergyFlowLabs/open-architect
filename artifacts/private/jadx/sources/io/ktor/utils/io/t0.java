package io.ktor.utils.io;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@oj.g
@o0
@SourceDebugExtension({"SMAP\nLineEndingMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineEndingMode.kt\nio/ktor/utils/io/LineEndingMode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n774#2:76\n865#2,2:77\n*S KotlinDebug\n*F\n+ 1 LineEndingMode.kt\nio/ktor/utils/io/LineEndingMode\n*L\n40#1:76\n40#1:77,2\n*E\n"})
public final class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f297157b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f297158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f297159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f297160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f297161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final List<t0> f297162g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f297163a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return t0.f297161f;
        }

        public final int b() {
            return t0.f297158c;
        }

        public final int c() {
            return t0.f297160e;
        }

        public final int d() {
            return t0.f297159d;
        }

        private a() {
        }
    }

    static {
        int iF = f(1);
        f297158c = iF;
        int iF2 = f(2);
        f297159d = iF2;
        int i10 = 4 << 4;
        int iF3 = f(4);
        f297160e = iF3;
        f297161f = f(7);
        f297162g = CollectionsKt.listOf((Object[]) new t0[]{e(iF), e(iF2), e(iF3)});
    }

    private /* synthetic */ t0(int i10) {
        this.f297163a = i10;
    }

    public static final /* synthetic */ t0 e(int i10) {
        return new t0(i10);
    }

    private static int f(int i10) {
        return i10;
    }

    public static final boolean g(int i10, int i11) {
        return (i11 | i10) == i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof t0) && i10 == ((t0) obj).m();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return Integer.hashCode(i10);
    }

    public static final int k(int i10, int i11) {
        return f(i10 | i11);
    }

    @NotNull
    public static String l(int i10) {
        if (i(i10, f297158c)) {
            return "CR";
        }
        if (i(i10, f297159d)) {
            return "LF";
        }
        if (i(i10, f297160e)) {
            return "CRLF";
        }
        List<t0> list = f297162g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (g(i10, ((t0) obj).m())) {
                arrayList.add(obj);
            }
        }
        return arrayList.toString();
    }

    public boolean equals(Object obj) {
        return h(this.f297163a, obj);
    }

    public int hashCode() {
        return j(this.f297163a);
    }

    public final /* synthetic */ int m() {
        return this.f297163a;
    }

    @NotNull
    public String toString() {
        return l(this.f297163a);
    }
}
