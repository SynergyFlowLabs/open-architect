package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.l(message = "FlowLayout overflow is no longer maintained")
@androidx.compose.runtime.internal.w0(parameters = 1)
@u1
@SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,851:1\n1#2:852\n*E\n"})
public abstract class u2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f16457f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f16458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Function1<y2, Function2<androidx.compose.runtime.c0, Integer, Unit>> f16461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Function1<y2, Function2<androidx.compose.runtime.c0, Integer, Unit>> f16462e;

    public enum a {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f16468f = kotlin.enums.c.c(k());

        static {
            int i10 = 3 >> 2;
        }

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f16468f;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16469a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16469a = iArr;
        }
    }

    public /* synthetic */ u2(a aVar, int i10, int i11, Function1 function1, Function1 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i10, i11, function1, function2);
    }

    public final void a(@NotNull y2 y2Var, @NotNull List<Function2<androidx.compose.runtime.c0, Integer, Unit>> list) {
        Function1<y2, Function2<androidx.compose.runtime.c0, Integer, Unit>> function1 = this.f16461d;
        Function2<androidx.compose.runtime.c0, Integer, Unit> function2Invoke = function1 != null ? function1.invoke(y2Var) : null;
        Function1<y2, Function2<androidx.compose.runtime.c0, Integer, Unit>> function2 = this.f16462e;
        Function2<androidx.compose.runtime.c0, Integer, Unit> function2Invoke2 = function2 != null ? function2.invoke(y2Var) : null;
        int i10 = b.f16469a[this.f16458a.ordinal()];
        if (i10 == 1) {
            if (function2Invoke != null) {
                list.add(function2Invoke);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (function2Invoke != null) {
                list.add(function2Invoke);
            }
            if (function2Invoke2 != null) {
                list.add(function2Invoke2);
            }
        }
    }

    @NotNull
    public final y2 b() {
        return new y2(this.f16458a, this.f16459b, this.f16460c);
    }

    @NotNull
    public final a c() {
        return this.f16458a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u2(a aVar, int i10, int i11, Function1<? super y2, ? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> function1, Function1<? super y2, ? extends Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>> function2) {
        this.f16458a = aVar;
        this.f16459b = i10;
        this.f16460c = i11;
        this.f16461d = function1;
        this.f16462e = function2;
    }

    public /* synthetic */ u2(a aVar, int i10, int i11, Function1 function1, Function1 function2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : function1, (i12 & 16) != 0 ? null : function2, null);
    }
}
