package com.planner5d.library.activity.fragment.settings.orders;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.payments.u;
import com.planner5d.library.model.payments.Payment;
import com.planner5d.library.modules.user.user.t;
import com.planner5d.library.modules.user.user.x;
import com.planner5d.library.services.textspan.UrlSpanWithListener;
import com.planner5d.library.services.utility.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@l(message = "Use OrdersHistoryAdapter")
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nOrdersAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersAdapter.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n11165#2:231\n11500#2,3:232\n37#3,2:235\n*S KotlinDebug\n*F\n+ 1 OrdersAdapter.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersAdapter\n*L\n54#1:231\n54#1:232,3\n60#1:235,2\n*E\n"})
public final class a extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f135275g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p0 f135276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.application.d f135277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t f135278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Pair<Payment, com.planner5d.library.model.payments.a>[] f135279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private String[] f135280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private AtomicReference<InterfaceC1484a> f135281f;

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.settings.orders.a$a, reason: collision with other inner class name */
    public interface InterfaceC1484a {
        void b(@NotNull Payment payment);

        void i();
    }

    @w0(parameters = 1)
    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f135282a = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ViewGroup container) {
            super(LayoutInflater.from(container.getContext()).inflate(com.planner5d.library.f.m.D7, container, false));
            Intrinsics.checkNotNullParameter(container, "container");
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nOrdersAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersAdapter.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersAdapter$ViewHolderOrder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,230:1\n11165#2:231\n11500#2,3:232\n13474#2,3:237\n37#3,2:235\n1#4:240\n*S KotlinDebug\n*F\n+ 1 OrdersAdapter.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersAdapter$ViewHolderOrder\n*L\n99#1:231\n99#1:232,3\n113#1:237,3\n99#1:235,2\n*E\n"})
    public static final class c extends RecyclerView.g0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f135283e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final p0 f135284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final com.planner5d.library.application.d f135285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final TextView[] f135286c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final ImageButton f135287d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Context context, @NotNull p0 formatter, @NotNull com.planner5d.library.application.d configuration) {
            super(LayoutInflater.from(context).inflate(com.planner5d.library.f.m.C7, (ViewGroup) null));
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f135284a = formatter;
            this.f135285b = configuration;
            Integer[] numArr = {Integer.valueOf(com.planner5d.library.f.j.f168131i7), Integer.valueOf(com.planner5d.library.f.j.f168155j7), Integer.valueOf(com.planner5d.library.f.j.f168179k7), Integer.valueOf(com.planner5d.library.f.j.f168203l7)};
            ArrayList arrayList = new ArrayList(4);
            for (int i10 = 0; i10 < 4; i10++) {
                arrayList.add((TextView) this.itemView.findViewById(numArr[i10].intValue()));
            }
            this.f135286c = (TextView[]) arrayList.toArray(new TextView[0]);
            View viewFindViewById = this.itemView.findViewById(com.planner5d.library.f.j.M4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f135287d = (ImageButton) viewFindViewById;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(InterfaceC1484a interfaceC1484a, Payment payment, View view) {
            if (interfaceC1484a != null) {
                interfaceC1484a.b(payment);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(Context context, String str, View view) {
            Toast.makeText(context, str, 1).show();
        }

        private final TextView m(int i10, String str) {
            TextView textView = this.f135286c[i10];
            textView.setText(com.planner5d.library.services.textspan.b.d(str));
            return textView;
        }

        private final String n(String str) {
            if (str == null) {
                str = com.planner5d.library.model.payments.a.f222474i;
            }
            return "<font color=#989898><small>" + str + "</small></font>";
        }

        /* JADX WARN: Code duplicated, block: B:51:0x0216 A[Catch: Exception -> 0x0219, TRY_LEAVE, TryCatch #0 {Exception -> 0x0219, blocks: (B:46:0x0206, B:48:0x020c, B:50:0x0213, B:51:0x0216), top: B:71:0x0206 }] */
        @e.a({"StringFormatInvalid"})
        public final void i(@Nullable id.a aVar, @NotNull final Payment payment, @Nullable com.planner5d.library.model.payments.a aVar2, @Nullable final InterfaceC1484a interfaceC1484a) {
            int i10;
            int i11;
            String str;
            String string;
            Intrinsics.checkNotNullParameter(payment, "payment");
            final Context context = this.itemView.getContext();
            long jA = x.a(aVar);
            String strF = this.f135284a.f(payment.v());
            Intrinsics.checkNotNullExpressionValue(strF, "date(...)");
            List listSplit$default = StringsKt.split$default(strF, new String[]{" "}, false, 0, 6, null);
            m(0, listSplit$default.get(0) + "<br />" + n((String) listSplit$default.get(1)));
            String string2 = com.planner5d.library.model.payments.a.f222474i;
            m(1, com.planner5d.library.model.payments.a.f222474i).setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.settings.orders.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.c.j(interfaceC1484a, payment, view);
                }
            });
            m(2, com.planner5d.library.model.payments.a.f222474i);
            if (aVar2 != null) {
                String str2 = String.format("%1$s<br />%2$s", Arrays.copyOf(new Object[]{Payment.f222462a.a(payment.y()), n(aVar2.b())}, 2));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                m(1, str2);
                try {
                    fd.i iVarD = aVar2.d(jA);
                    fd.k kVarI = iVarD.i();
                    Intrinsics.checkNotNull(context);
                    String strA = fd.l.a(kVarI, context, this.f135285b.a());
                    String str3 = "";
                    if (iVarD.i() == fd.k.CATALOG) {
                        if (iVarD.m()) {
                            string = context.getString(com.planner5d.library.f.s.qw);
                        } else if (iVarD.r()) {
                            String strG = aVar2.d(jA).g(context);
                            Locale locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                            string = strG.toLowerCase(locale);
                            Intrinsics.checkNotNullExpressionValue(string, "toLowerCase(...)");
                        } else {
                            int i12 = com.planner5d.library.f.s.A5;
                            Integer numE = aVar2.d(jA).e();
                            string = context.getString(i12, Integer.valueOf(numE != null ? numE.intValue() : 0));
                        }
                        str = " - " + string;
                    } else if (iVarD.i() == fd.k.RENDERS && iVarD.v()) {
                        str = " - " + context.getString(com.planner5d.library.f.s.qw);
                    } else {
                        str = "";
                    }
                    String str4 = strA + str;
                    if (iVarD.k()) {
                        str3 = "<br/>" + n(context.getString(com.planner5d.library.f.s.I1));
                    }
                    String str5 = String.format("%1$s%2$s", Arrays.copyOf(new Object[]{str4, str3}, 2));
                    Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                    m(2, str5);
                } catch (u.a e10) {
                    timber.log.b.f381052a.e(e10);
                    Unit unit = Unit.f312394a;
                }
            }
            int iB = payment.B();
            if (iB == Payment.b.Failed.n()) {
                string2 = context.getString(com.planner5d.library.f.s.Ob);
            } else if (iB == Payment.b.Finished.n()) {
                string2 = String.format("%1$s<br />%2$s", Arrays.copyOf(new Object[]{context.getString(com.planner5d.library.f.s.ut), n(context.getString(com.planner5d.library.f.s.oG))}, 2));
                Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
            } else if (iB == Payment.b.Validated.n()) {
                string2 = String.format("%1$s<br />%2$s", Arrays.copyOf(new Object[]{context.getString(com.planner5d.library.f.s.ut), n(context.getString(com.planner5d.library.f.s.U3))}, 2));
                Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
            } else if (iB == Payment.b.Consumed.n()) {
                if (aVar2 != null) {
                    try {
                        fd.i iVarD2 = aVar2.d(jA);
                        if (iVarD2 == null || !iVarD2.l()) {
                            i10 = com.planner5d.library.f.s.O1;
                        } else {
                            i10 = com.planner5d.library.f.s.Gb;
                        }
                    } catch (Exception unused) {
                        i10 = com.planner5d.library.f.s.Gb;
                    }
                    string2 = context.getString(i10);
                } else {
                    i10 = com.planner5d.library.f.s.O1;
                    string2 = context.getString(i10);
                }
            } else if (iB == Payment.b.StartedAndPending.n()) {
                string2 = context.getString(com.planner5d.library.f.s.Ut);
            }
            Intrinsics.checkNotNull(string2);
            m(3, string2);
            final String strW = payment.w();
            ImageButton imageButton = this.f135287d;
            if (payment.B() == Payment.b.Validated.n() || strW == null || strW.length() <= 0) {
                i11 = 4;
            } else {
                if (this.f135287d.getDrawable() == null) {
                    this.f135287d.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(context, com.planner5d.library.f.h.Y7, Integer.valueOf(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.N3))));
                    this.f135287d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.settings.orders.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            a.c.k(context, strW, view);
                        }
                    });
                }
                i11 = 0;
            }
            imageButton.setVisibility(i11);
        }

        public final void l() {
            this.f135287d.setVisibility(8);
            Integer[] numArr = {Integer.valueOf(com.planner5d.library.f.s.ot), Integer.valueOf(com.planner5d.library.f.s.rt), Integer.valueOf(com.planner5d.library.f.s.qt), Integer.valueOf(com.planner5d.library.f.s.st)};
            int i10 = 0;
            int i11 = 0;
            while (i10 < 4) {
                int i12 = i11 + 1;
                String string = this.itemView.getContext().getString(numArr[i10].intValue());
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                TextView textViewM = m(i11, string);
                textViewM.setTextColor(-6776680);
                textViewM.setGravity(80);
                i10++;
                i11 = i12;
            }
        }
    }

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nOrdersAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersAdapter.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersAdapter$ViewHolderSummary\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n11165#2:231\n11500#2,3:232\n13409#2,2:237\n13474#2,3:239\n37#3,2:235\n*S KotlinDebug\n*F\n+ 1 OrdersAdapter.kt\ncom/planner5d/library/activity/fragment/settings/orders/OrdersAdapter$ViewHolderSummary\n*L\n203#1:231\n203#1:232,3\n204#1:237,2\n211#1:239,3\n203#1:235,2\n*E\n"})
    public static final class d extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f135288b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final TextView[] f135289a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull ViewGroup container) {
            super(LayoutInflater.from(container.getContext()).inflate(com.planner5d.library.f.m.E7, container, false));
            Intrinsics.checkNotNullParameter(container, "container");
            Integer[] numArr = {Integer.valueOf(com.planner5d.library.f.j.f168131i7), Integer.valueOf(com.planner5d.library.f.j.f168155j7), Integer.valueOf(com.planner5d.library.f.j.f168179k7)};
            ArrayList arrayList = new ArrayList(3);
            for (int i10 = 0; i10 < 3; i10++) {
                arrayList.add((TextView) this.itemView.findViewById(numArr[i10].intValue()));
            }
            TextView[] textViewArr = (TextView[]) arrayList.toArray(new TextView[0]);
            for (TextView textView : textViewArr) {
                textView.setLinksClickable(true);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
            this.f135289a = textViewArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(InterfaceC1484a interfaceC1484a, String str) {
            if (!Intrinsics.areEqual(str, "p5d://update_orders") || interfaceC1484a == null) {
                return;
            }
            interfaceC1484a.i();
        }

        public final void h(@NotNull String[] texts, @Nullable final InterfaceC1484a interfaceC1484a) {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int length = texts.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                String str = texts[i10];
                int i12 = i11 + 1;
                this.f135289a[i11].setText(com.planner5d.library.services.textspan.b.h("<small>" + str + "</small>", new UrlSpanWithListener.a() { // from class: com.planner5d.library.activity.fragment.settings.orders.d
                    @Override // com.planner5d.library.services.textspan.UrlSpanWithListener.a
                    public final void a(String str2) {
                        a.d.i(interfaceC1484a, str2);
                    }
                }, null, true));
                i10++;
                i11 = i12;
            }
        }
    }

    @ij.a
    public a(@NotNull p0 formatter, @NotNull com.planner5d.library.application.d configuration, @NotNull t userAuthorization) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(userAuthorization, "userAuthorization");
        this.f135276a = formatter;
        this.f135277b = configuration;
        this.f135278c = userAuthorization;
        this.f135279d = new Pair[0];
        this.f135280e = new String[0];
        this.f135281f = new AtomicReference<>(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f135279d.length + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 != 1) {
            return 3;
        }
        return this.f135279d.length == 0 ? 1 : 2;
    }

    public final boolean h() {
        return this.f135279d.length == 0;
    }

    @e.a({"NotifyDataSetChanged"})
    @NotNull
    public final a i(@NotNull String[] summary, @NotNull Payment[] list) {
        com.planner5d.library.model.payments.a aVarS;
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f135280e = summary;
        ArrayList arrayList = new ArrayList(list.length);
        for (Payment payment : list) {
            try {
                aVarS = payment.s();
            } catch (Throwable unused) {
                aVarS = null;
            }
            arrayList.add(TuplesKt.to(payment, aVarS));
        }
        this.f135279d = (Pair[]) arrayList.toArray(new Pair[0]);
        notifyDataSetChanged();
        return this;
    }

    @NotNull
    public final a j(@Nullable InterfaceC1484a interfaceC1484a) {
        this.f135281f.set(interfaceC1484a);
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i10 == 0) {
            ((d) holder).h(this.f135280e, this.f135281f.get());
            return;
        }
        if (i10 != 1) {
            Pair<Payment, com.planner5d.library.model.payments.a> pair = this.f135279d[i10 - 2];
            ((c) holder).i(this.f135278c.a(), pair.getFirst(), pair.getSecond(), this.f135281f.get());
        } else if (holder instanceof c) {
            ((c) holder).l();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup container, int i10) {
        Intrinsics.checkNotNullParameter(container, "container");
        if (i10 == 0) {
            return new d(container);
        }
        if (i10 == 1) {
            return new b(container);
        }
        Context context = container.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new c(context, this.f135276a, this.f135277b);
    }
}
