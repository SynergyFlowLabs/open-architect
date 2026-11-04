package fb;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.contest.e;
import com.planner5d.library.contest.view.prize.ContestPrizeView;
import com.planner5d.library.database.model.contest.ContestPrize;
import com.planner5d.library.model.manager.x2;
import fd.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@w0(parameters = 0)
public final class a extends RecyclerView.h<C1900a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f275104d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f275105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x2 f275106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<ContestPrize> f275107c;

    /* JADX INFO: renamed from: fb.a$a, reason: collision with other inner class name */
    @w0(parameters = 0)
    public static final class C1900a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f275108b = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ContestPrizeView f275109a;

        private C1900a(ContestPrizeView contestPrizeView) {
            super(contestPrizeView);
            this.f275109a = contestPrizeView;
        }

        public final void g(@NotNull Context context, @NotNull x2 configuration, @NotNull ContestPrize prize) {
            int i10;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(prize, "prize");
            String strX = prize.x();
            k kVar = k.RENDERS;
            int i11 = 2 ^ 0;
            if (Intrinsics.areEqual(strX, kVar.q())) {
                i10 = e.g.f150637s4;
            } else {
                kVar = k.TEXTURES;
                if (Intrinsics.areEqual(strX, kVar.q())) {
                    i10 = e.g.f150652t4;
                } else {
                    kVar = k.CATALOG;
                    if (Intrinsics.areEqual(strX, kVar.q())) {
                        i10 = e.g.f150607q4;
                    } else {
                        i10 = 0;
                        kVar = null;
                    }
                }
            }
            ContestPrizeView contestPrizeView = this.f275109a;
            contestPrizeView.setImage(i10);
            if (kVar == k.CATALOG) {
                contestPrizeView.setTitle(context.getString(e.r.f151727o4));
                contestPrizeView.setQuantity(context.getString(e.r.O3));
                return;
            }
            contestPrizeView.setTitle(kVar != null ? kVar.p(context, configuration.a()) : null);
            contestPrizeView.setQuantity(context.getString(e.r.P3) + prize.w());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public C1900a(@NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this(new ContestPrizeView(context, null, 0, 6, null));
        }
    }

    public a(@NotNull Context context, @NotNull x2 configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f275105a = context;
        this.f275106b = configuration;
        this.f275107c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f275107c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C1900a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.g(this.f275105a, this.f275106b, this.f275107c.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C1900a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new C1900a(parent);
    }

    @e.a({"NotifyDataSetChanged"})
    public final void j(@NotNull List<ContestPrize> prizes) {
        Intrinsics.checkNotNullParameter(prizes, "prizes");
        List<ContestPrize> list = this.f275107c;
        list.clear();
        list.addAll(prizes);
        notifyDataSetChanged();
    }
}
