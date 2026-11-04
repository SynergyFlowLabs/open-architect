package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l {

    public static final class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f315859a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f315860a = new b();

        private b() {
            super(null);
        }
    }

    public /* synthetic */ l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @NotNull
    public String toString() {
        String strQ = j1.d(getClass()).Q();
        Intrinsics.checkNotNull(strQ);
        return strQ;
    }

    private l() {
    }
}
