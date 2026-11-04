package fd;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public enum k {
    CATALOG("catalog"),
    RENDERS("renders"),
    TEXTURES("textures"),
    DESIGN_GENERATOR("design_generator"),
    PLAN_RECOGNITIONS("recognitions");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f275186a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f275185i = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f275178b = new a(null);

    @SourceDebugExtension({"SMAP\nProductType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProductType.kt\ncom/planner5d/library/model/payments/ProductType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @Nullable
        public final k a(@Nullable String str) {
            k next;
            Iterator<k> it = k.n().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.q(), str)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f275187a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.CATALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.RENDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.TEXTURES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.DESIGN_GENERATOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.PLAN_RECOGNITIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f275187a = iArr;
        }
    }

    k(String str) {
        this.f275186a = str;
    }

    @oj.n
    @Nullable
    public static final k l(@Nullable String str) {
        return f275178b.a(str);
    }

    @NotNull
    public static kotlin.enums.a<k> n() {
        return f275185i;
    }

    @Nullable
    public final Drawable o(@NotNull Context context) {
        int i10;
        Intrinsics.checkNotNullParameter(context, "context");
        com.planner5d.library.widget.drawable.c cVar = com.planner5d.library.widget.drawable.c.f254258a;
        int i11 = b.f275187a[ordinal()];
        if (i11 == 1) {
            i10 = qd.b.g.f352002a5;
        } else if (i11 == 2) {
            i10 = qd.b.g.f352041d5;
        } else if (i11 != 3) {
            int i12 = 2 << 4;
            if (i11 == 4) {
                i10 = qd.b.g.T6;
            } else {
                if (i11 != 5) {
                    throw new k0();
                }
                i10 = qd.b.g.M7;
            }
        } else {
            i10 = qd.b.g.T6;
        }
        return cVar.h(context, i10, qd.b.e.f350980al);
    }

    @NotNull
    public final String p(@NotNull Context context, boolean z10) {
        int i10;
        Intrinsics.checkNotNullParameter(context, "context");
        int i11 = b.f275187a[ordinal()];
        if (i11 == 1) {
            i10 = z10 ? qd.b.q.Rj : qd.b.q.f353169rb;
        } else if (i11 == 2) {
            i10 = qd.b.q.Vm;
        } else if (i11 == 3) {
            i10 = qd.b.q.Bs;
        } else if (i11 == 4) {
            i10 = qd.b.q.dt;
        } else {
            if (i11 != 5) {
                throw new k0();
            }
            i10 = qd.b.q.f352816cj;
        }
        String string = context.getString(i10);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @NotNull
    public final String q() {
        return this.f275186a;
    }
}
