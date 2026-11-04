package androidx.compose.material.pullrefresh;

import androidx.compose.ui.unit.c0;
import androidx.compose.ui.unit.d0;
import com.rabbitmq.client.k0;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPullRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,101:1\n69#2:102\n69#2:105\n69#2:112\n69#2:115\n70#3:103\n70#3:106\n53#3,3:109\n70#3:113\n70#3:116\n53#3,3:119\n22#4:104\n22#4:107\n22#4:114\n22#4:117\n30#5:108\n30#5:118\n*S KotlinDebug\n*F\n+ 1 PullRefresh.kt\nandroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection\n*L\n80#1:102\n81#1:105\n92#1:112\n93#1:115\n80#1:103\n81#1:106\n81#1:109,3\n92#1:113\n93#1:116\n93#1:119,3\n80#1:104\n81#1:107\n92#1:114\n93#1:117\n81#1:108\n93#1:118\n*E\n"})
final class n implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Float> f24330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<Float, kotlin.coroutines.d<? super Float>, Object> f24331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f24332c;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160718p1}, m = "onPreFling-QWom1Mo", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f24333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24334b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f24336d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24334b = obj;
            this.f24336d |= Integer.MIN_VALUE;
            return n.this.a4(0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull Function1<? super Float, Float> function1, @NotNull Function2<? super Float, ? super kotlin.coroutines.d<? super Float>, ? extends Object> function2, boolean z10) {
        this.f24330a = function1;
        this.f24331b = function2;
        this.f24332c = z10;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long G7(long j10, int i10) {
        if (!this.f24332c) {
            return n0.g.f332700b.e();
        }
        if (androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) {
            int i11 = (int) (j10 & k0.f265952a);
            if (Float.intBitsToFloat(i11) < 0.0f) {
                float fFloatValue = this.f24330a.invoke(Float.valueOf(Float.intBitsToFloat(i11))).floatValue();
                return n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue)) & k0.f265952a));
            }
        }
        return n0.g.f332700b.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object a4(long j10, @NotNull kotlin.coroutines.d<? super c0> dVar) {
        a aVar;
        float f10;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f24336d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f24336d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objInvoke = aVar.f24334b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f24336d;
        if (i11 == 0) {
            ResultKt.m(objInvoke);
            Function2<Float, kotlin.coroutines.d<? super Float>, Object> function2 = this.f24331b;
            Float fE = kotlin.coroutines.jvm.internal.b.e(c0.n(j10));
            aVar.f24333a = 0.0f;
            aVar.f24336d = 1;
            objInvoke = function2.invoke(fE, aVar);
            if (objInvoke == objL) {
                return objL;
            }
            f10 = 0.0f;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = aVar.f24333a;
            ResultKt.m(objInvoke);
        }
        return c0.b(d0.a(f10, ((Number) objInvoke).floatValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long b2(long j10, long j11, int i10) {
        if (!this.f24332c) {
            return n0.g.f332700b.e();
        }
        if (androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) {
            int i11 = (int) (j11 & k0.f265952a);
            if (Float.intBitsToFloat(i11) > 0.0f) {
                return n0.g.g((((long) Float.floatToRawIntBits(this.f24330a.invoke(Float.valueOf(Float.intBitsToFloat(i11))).floatValue())) & k0.f265952a) | (Float.floatToRawIntBits(0.0f) << 32));
            }
        }
        return n0.g.f332700b.e();
    }
}
