package androidx.compose.ui.focus;

import androidx.compose.ui.platform.q1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@oj.g
@SourceDebugExtension({"SMAP\nFocusability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Focusability.kt\nandroidx/compose/ui/focus/Focusability\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f37469b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f37470c = f(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f37471d = f(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f37472e = f(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37473a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return w0.f37470c;
        }

        public final int b() {
            return w0.f37472e;
        }

        public final int c() {
            return w0.f37471d;
        }

        private a() {
        }
    }

    private /* synthetic */ w0(int i10) {
        this.f37473a = i10;
    }

    public static final /* synthetic */ w0 d(int i10) {
        return new w0(i10);
    }

    public static final boolean e(int i10, @NotNull androidx.compose.ui.node.h hVar) {
        if (h(i10, f37470c)) {
            return true;
        }
        if (h(i10, f37471d)) {
            return !q0.a.f(((q0.b) androidx.compose.ui.node.i.a(hVar, q1.t())).b(), q0.a.f350233b.b());
        }
        if (h(i10, f37472e)) {
            return false;
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    private static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof w0) && i10 == ((w0) obj).k();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return Integer.hashCode(i10);
    }

    @NotNull
    public static String j(int i10) {
        if (h(i10, f37470c)) {
            return "Always";
        }
        if (h(i10, f37471d)) {
            return "SystemDefined";
        }
        if (h(i10, f37472e)) {
            return "Never";
        }
        throw new IllegalStateException("Unknown Focusability");
    }

    public boolean equals(Object obj) {
        return g(this.f37473a, obj);
    }

    public int hashCode() {
        return i(this.f37473a);
    }

    public final /* synthetic */ int k() {
        return this.f37473a;
    }

    @NotNull
    public String toString() {
        return j(this.f37473a);
    }
}
