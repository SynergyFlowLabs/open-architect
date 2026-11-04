package coil.size;

import androidx.annotation.t0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    @SourceDebugExtension({"SMAP\nDimension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dimension.kt\ncoil/size/Dimension$Pixels\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f87767a;

        public a(@t0 int i10) {
            super(null);
            this.f87767a = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f87767a == ((a) obj).f87767a;
        }

        public int hashCode() {
            return this.f87767a;
        }

        @NotNull
        public String toString() {
            return String.valueOf(this.f87767a);
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f87768a = new b();

        private b() {
            super(null);
        }

        @NotNull
        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
