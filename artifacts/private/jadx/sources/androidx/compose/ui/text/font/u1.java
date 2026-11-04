package androidx.compose.ui.text.font;

import androidx.compose.runtime.n7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface u1 extends n7<Object> {

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a implements u1, n7<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f41737b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final n f41738a;

        public a(@NotNull n nVar) {
            this.f41738a = nVar;
        }

        @NotNull
        public final n a() {
            return this.f41738a;
        }

        @Override // androidx.compose.runtime.n7
        @NotNull
        public Object getValue() {
            return this.f41738a.getValue();
        }

        @Override // androidx.compose.ui.text.font.u1
        public boolean i() {
            return this.f41738a.b();
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b implements u1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f41739c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Object f41740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f41741b;

        public b(@NotNull Object obj, boolean z10) {
            this.f41740a = obj;
            this.f41741b = z10;
        }

        @Override // androidx.compose.runtime.n7
        @NotNull
        public Object getValue() {
            return this.f41740a;
        }

        @Override // androidx.compose.ui.text.font.u1
        public boolean i() {
            return this.f41741b;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }
    }

    boolean i();
}
