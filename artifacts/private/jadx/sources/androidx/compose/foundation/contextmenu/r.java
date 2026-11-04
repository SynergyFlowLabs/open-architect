package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.n3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,78:1\n85#2:79\n117#2,2:80\n*S KotlinDebug\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState\n*L\n33#1:79\n33#1:80,2\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14083b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n3 f14084a;

    @w0(parameters = 1)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f14085a = 0;

        /* JADX INFO: renamed from: androidx.compose.foundation.contextmenu.r$a$a, reason: collision with other inner class name */
        @w0(parameters = 1)
        public static final class C0071a extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final C0071a f14086b = new C0071a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f14087c = 0;

            private C0071a() {
                super(null);
            }

            @NotNull
            public String toString() {
                return "Closed";
            }
        }

        @w0(parameters = 1)
        @SourceDebugExtension({"SMAP\nContextMenuState.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,78:1\n273#2:79\n51#3,4:80\n*S KotlinDebug\n*F\n+ 1 ContextMenuState.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuState$Status$Open\n*L\n53#1:79\n53#1:80,4\n*E\n"})
        public static final class b extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f14088c = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f14089b;

            public /* synthetic */ b(long j10, DefaultConstructorMarker defaultConstructorMarker) {
                this(j10);
            }

            public final long a() {
                return this.f14089b;
            }

            public boolean equals(@Nullable Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof b) {
                    return n0.g.l(this.f14089b, ((b) obj).f14089b);
                }
                int i10 = 7 >> 0;
                return false;
            }

            public int hashCode() {
                return n0.g.t(this.f14089b);
            }

            @NotNull
            public String toString() {
                return "Open(offset=" + ((Object) n0.g.z(this.f14089b)) + ')';
            }

            private b(long j10) {
                super(null);
                this.f14089b = j10;
                if ((j10 & 9223372034707292159L) != n0.d.f332689d) {
                    return;
                }
                androidx.compose.foundation.internal.e.i("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final a a() {
        return (a) this.f14084a.getValue();
    }

    public final void b(@NotNull a aVar) {
        this.f14084a.setValue(aVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            return Intrinsics.areEqual(((r) obj).a(), a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    @NotNull
    public String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public r(@NotNull a aVar) {
        this.f14084a = d7.g(aVar, null, 2, null);
    }

    public /* synthetic */ r(a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.C0071a.f14086b : aVar);
    }
}
