package androidx.work.impl.constraints;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    public static final class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f76752a = new a();

        private a() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: androidx.work.impl.constraints.b$b, reason: collision with other inner class name */
    public static final class C0778b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f76753a;

        public C0778b(int i10) {
            super(null);
            this.f76753a = i10;
        }

        public static /* synthetic */ C0778b c(C0778b c0778b, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = c0778b.f76753a;
            }
            return c0778b.b(i10);
        }

        public final int a() {
            return this.f76753a;
        }

        @NotNull
        public final C0778b b(int i10) {
            return new C0778b(i10);
        }

        public final int d() {
            return this.f76753a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0778b) && this.f76753a == ((C0778b) obj).f76753a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f76753a);
        }

        @NotNull
        public String toString() {
            return "ConstraintsNotMet(reason=" + this.f76753a + ')';
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
