package com.planner5d.library.activity.fragment.settings.orders;

import android.app.Application;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.model.manager.b4;
import com.planner5d.library.model.manager.s2;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.t0;
import com.planner5d.library.services.utility.p0;
import com.planner5d.library.services.utility.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@l(message = "Use OrdersHistoryFragment")
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f135298g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f135299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p0 f135300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b4 f135301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final s2 f135302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final t0 f135303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final id.a f135304f;

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f135305c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f135306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f135307b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }

        public final int a() {
            return this.f135307b;
        }

        public final boolean b() {
            return this.f135306a;
        }

        public a(boolean z10, int i10) {
            this.f135306a = z10;
            this.f135307b = i10;
        }

        public /* synthetic */ a(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.settings.orders.OrdersSummary$getTexts$2", f = "OrdersSummary.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nOrdersSummary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersSummary.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersSummary$getTexts$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,80:1\n11165#2:81\n11500#2,3:82\n37#3,2:85\n*S KotlinDebug\n*F\n+ 1 OrdersSummary.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersSummary$getTexts$2\n*L\n39#1:81\n39#1:82,3\n39#1:85,2\n*E\n"})
    static final class b extends o implements Function2<s0, kotlin.coroutines.d<? super String[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f135308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f135309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f135310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f135311d;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return f.this.new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object[] objArr;
            Object objM;
            Object[] objArr2;
            int i10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f135311d;
            if (i11 == 0) {
                ResultKt.m(obj);
                objArr = new List[3];
                String str = String.format("<b>%1$s</b>", Arrays.copyOf(new Object[]{f.this.f135299a.getString(com.planner5d.library.f.s.E1)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                objArr[0] = CollectionsKt.listOf((Object[]) new String[]{str, ArraysKt.joinToString$default(new String[]{f.this.f135299a.getString(com.planner5d.library.f.s.C2), f.this.i()}, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null), f.this.m()});
                String str2 = String.format("<b>%1$s <a href=\"p5d://update_orders\"><big>↻</big</a></b>", Arrays.copyOf(new Object[]{f.this.f135299a.getString(com.planner5d.library.f.s.I1)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                objArr[1] = CollectionsKt.listOf((Object[]) new String[]{str2, ArraysKt.joinToString$default(new String[]{f.this.f135299a.getString(com.planner5d.library.f.s.C2), f.this.j()}, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)});
                s2 s2Var = f.this.f135302d;
                Application application = f.this.f135299a;
                id.a aVar = f.this.f135304f;
                this.f135308a = objArr;
                this.f135309b = objArr;
                this.f135310c = 2;
                this.f135311d = 1;
                objM = s2Var.m(application, aVar, this);
                if (objM == objL) {
                    return objL;
                }
                objArr2 = objArr;
                i10 = 2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = this.f135310c;
                Object[] objArr3 = (List[]) this.f135309b;
                Object[] objArr4 = (List[]) this.f135308a;
                ResultKt.m(obj);
                objArr2 = objArr3;
                objArr = objArr4;
                objM = obj;
            }
            objArr2[i10] = objM;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList.add(CollectionsKt.joinToString$default((Iterable) obj2, "<br />", null, null, 0, null, null, 62, null));
            }
            return arrayList.toArray(new String[0]);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super String[]> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @ij.a
    public f(@NotNull Application context, @NotNull p0 formatter, @NotNull t userAuthorization, @NotNull b4 snapshotManager, @NotNull s2 paymentsManager, @NotNull t0 userPurchases) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        Intrinsics.checkNotNullParameter(snapshotManager, "snapshotManager");
        Intrinsics.checkNotNullParameter(paymentsManager, "paymentsManager");
        Intrinsics.checkNotNullParameter(userPurchases, "userPurchases");
        this.f135299a = context;
        this.f135300b = formatter;
        this.f135301c = snapshotManager;
        this.f135302d = paymentsManager;
        this.f135303e = userPurchases;
        this.f135304f = userAuthorization.a();
    }

    private final a g() {
        return new a(this.f135303e.q(this.f135304f), this.f135303e.p(this.f135304f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a h() {
        if (this.f135303e.u(this.f135304f) || this.f135303e.P()) {
            return new a(this.f135303e.Z(this.f135304f), this.f135303e.L(this.f135304f));
        }
        return new a(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i() {
        return k(g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j() {
        return k(h());
    }

    private final String k(a aVar) {
        if (aVar.b()) {
            return "<i>" + this.f135299a.getString(com.planner5d.library.f.s.qw) + "</i>";
        }
        String string = this.f135299a.getString(com.planner5d.library.f.s.Tc, "<i>" + this.f135300b.y(aVar.a()) + "</i>");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @e.a({"StringFormatInvalid"})
    private final String l(a aVar) {
        String str = String.format("%1$s: <i>%2$s</i>", Arrays.copyOf(new Object[]{this.f135299a.getString(com.planner5d.library.f.s.MC), aVar.b() ? this.f135299a.getString(com.planner5d.library.f.s.qw) : this.f135300b.y(aVar.a())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m() {
        return l(o());
    }

    private final a o() {
        return new a(false, this.f135301c.J() ? this.f135303e.R(this.f135304f) : 0);
    }

    @Nullable
    public final Object n(@NotNull kotlin.coroutines.d<? super String[]> dVar) {
        return kotlinx.coroutines.i.h(s.f229729a.h(), new b(null), dVar);
    }
}
