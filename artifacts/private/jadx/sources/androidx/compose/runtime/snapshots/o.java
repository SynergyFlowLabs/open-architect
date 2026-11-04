package androidx.compose.runtime.snapshots;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36546a = 0;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f36547c = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final m f36548b;

        public a(@NotNull m mVar) {
            super(null);
            this.f36548b = mVar;
        }

        @Override // androidx.compose.runtime.snapshots.o
        public void a() throws n {
            this.f36548b.d();
            throw new n(this.f36548b);
        }

        @Override // androidx.compose.runtime.snapshots.o
        public boolean b() {
            return false;
        }

        @NotNull
        public final m c() {
            return this.f36548b;
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b extends o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final b f36549b = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f36550c = 0;

        private b() {
            super(null);
        }

        @Override // androidx.compose.runtime.snapshots.o
        public void a() {
        }

        @Override // androidx.compose.runtime.snapshots.o
        public boolean b() {
            return true;
        }
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract void a();

    public abstract boolean b();

    private o() {
    }
}
