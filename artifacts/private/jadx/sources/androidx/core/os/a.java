package androidx.core.os;

import androidx.annotation.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(api = 35)
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0395a f48021b = new C0395a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a f48022c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final a f48023d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48024a;

    /* JADX INFO: renamed from: androidx.core.os.a$a, reason: collision with other inner class name */
    public static final class C0395a {
        public /* synthetic */ C0395a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0395a() {
        }
    }

    private static final class b extends a {
        public b() {
            super(1, null);
        }
    }

    private static final class c extends a {
        public c() {
            super(2, null);
        }
    }

    public /* synthetic */ a(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    public final int a() {
        return this.f48024a;
    }

    private a(int i10) {
        this.f48024a = i10;
    }
}
