package com.planner5d.library.activity.fragment.dialog.onboarding;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.manager.u1;
import com.planner5d.library.services.utility.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nOnboardingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingAdapter.kt\ncom/planner5d/library/activity/fragment/dialog/onboarding/OnboardingAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n774#2:135\n865#2,2:136\n*S KotlinDebug\n*F\n+ 1 OnboardingAdapter.kt\ncom/planner5d/library/activity/fragment/dialog/onboarding/OnboardingAdapter\n*L\n51#1:135\n51#1:136,2\n*E\n"})
public final class b extends RecyclerView.h<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<l> f132183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f132184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Integer, Unit> f132185c;

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final qc.g f132186a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@NotNull qc.g binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.f132186a = binding;
        }

        private final void m(Resources.NotFoundException notFoundException) {
            Context context = this.f132186a.getRoot().getContext();
            Resources resources = context.getResources();
            String initiatingPackageName = Build.VERSION.SDK_INT >= 30 ? context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInitiatingPackageName() : "Unknown (too old Android version)";
            u1 u1VarN = com.planner5d.library.help.application.h.f179982b.a().n();
            Integer numValueOf = Integer.valueOf(resources.getDisplayMetrics().densityDpi);
            Intrinsics.checkNotNull(resources);
            String str = String.format("Installed from %s, device's dpi = %d, drawables:\n%s", Arrays.copyOf(new Object[]{initiatingPackageName, numValueOf, new l0(resources).a()}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            u1VarN.b("missing_image_resource", str, notFoundException);
        }

        @Override // com.planner5d.library.activity.fragment.dialog.onboarding.b.d
        public void h(@NotNull l item, @NotNull Function0<Unit> onSelect) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            super.h(item, onSelect);
            this.f132186a.f350341c.setText(j(item));
            try {
                this.f132186a.f350340b.setImageResource(item.h());
            } catch (Resources.NotFoundException e10) {
                m(e10);
                throw e10;
            }
        }
    }

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.dialog.onboarding.b$b, reason: collision with other inner class name */
    public static final class C1456b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final qc.h f132187a;

        /* JADX WARN: Illegal instructions before constructor call */
        public C1456b(@NotNull qc.h binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.f132187a = binding;
        }

        @Override // com.planner5d.library.activity.fragment.dialog.onboarding.b.d
        public void h(@NotNull l item, @NotNull Function0<Unit> onSelect) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            super.h(item, onSelect);
            this.f132187a.f350345d.setText(j(item));
            this.f132187a.f350344c.setImageResource(item.h());
            this.f132187a.f350343b.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            this.f132187a.f350343b.setClipToOutline(true);
        }
    }

    public static final class c extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final qc.i f132188a;

        /* JADX WARN: Illegal instructions before constructor call */
        public c(@NotNull qc.i binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            RelativeLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.f132188a = binding;
        }

        @Override // com.planner5d.library.activity.fragment.dialog.onboarding.b.d
        public void h(@NotNull l item, @NotNull Function0<Unit> onSelect) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            super.h(item, onSelect);
            this.f132188a.f350348c.setImageResource(item.h());
            this.f132188a.f350347b.setChecked(item.i());
        }

        @Override // com.planner5d.library.activity.fragment.dialog.onboarding.b.d
        public void k(@NotNull l item) {
            Intrinsics.checkNotNullParameter(item, "item");
            super.k(item);
            this.f132188a.f350347b.setChecked(item.i());
        }

        @Override // com.planner5d.library.activity.fragment.dialog.onboarding.b.d
        public boolean l(@NotNull l item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return !item.i();
        }
    }

    @SourceDebugExtension({"SMAP\nOnboardingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnboardingAdapter.kt\ncom/planner5d/library/activity/fragment/dialog/onboarding/OnboardingAdapter$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static abstract class d extends RecyclerView.g0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(d dVar, l lVar, Function0 function0, View view) {
            dVar.k(lVar);
            function0.invoke();
        }

        public void h(@NotNull final l item, @NotNull final Function0<Unit> onSelect) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(onSelect, "onSelect");
            this.itemView.setSelected(item.i());
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.onboarding.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.d.i(this.f132189a, item, onSelect, view);
                }
            });
        }

        @Nullable
        public CharSequence j(@NotNull l item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Integer numJ = item.j();
            if (numJ == null) {
                return null;
            }
            return this.itemView.getContext().getText(numJ.intValue());
        }

        public void k(@NotNull l item) {
            Intrinsics.checkNotNullParameter(item, "item");
            boolean zL = l(item);
            this.itemView.setSelected(zL);
            item.l(zL);
        }

        public boolean l(@NotNull l item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull List<l> list, int i10, @NotNull Function1<? super Integer, Unit> onItemClicked) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        this.f132183a = list;
        this.f132184b = i10;
        this.f132185c = onItemClicked;
    }

    private final void i(int i10) {
        int i11 = 0;
        for (l lVar : this.f132183a) {
            int i12 = i11 + 1;
            if (i11 != i10 && lVar.i()) {
                lVar.l(false);
                notifyItemChanged(i11);
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(d dVar, b bVar, int i10) {
        if (!(dVar instanceof c)) {
            bVar.i(i10);
        }
        bVar.f132185c.invoke(Integer.valueOf(i10));
        return Unit.f312394a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f132183a.size();
    }

    @NotNull
    public final List<l> j() {
        List<l> list = this.f132183a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l) obj).i()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull final d holder, final int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.h(this.f132183a.get(i10), new Function0() { // from class: com.planner5d.library.activity.fragment.dialog.onboarding.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b.l(holder, this, i10);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public d onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        int i11 = this.f132184b;
        if (i11 == 0) {
            qc.g gVarD = qc.g.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(gVarD, "inflate(...)");
            return new a(gVarD);
        }
        if (i11 == 1) {
            qc.g gVarD2 = qc.g.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(gVarD2, "inflate(...)");
            return new a(gVarD2);
        }
        if (i11 == 2) {
            qc.h hVarD = qc.h.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(hVarD, "inflate(...)");
            return new C1456b(hVarD);
        }
        if (i11 != 3) {
            throw new RuntimeException("Unknown step");
        }
        qc.i iVarD = qc.i.d(layoutInflaterFrom, parent, false);
        Intrinsics.checkNotNullExpressionValue(iVarD, "inflate(...)");
        return new c(iVarD);
    }
}
