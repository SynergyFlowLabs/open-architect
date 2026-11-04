package com.planner5d.library.dgenerator.fragment.list;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.database.model.AutoStyle;
import com.planner5d.library.database.model.AutoStyleImage;
import com.planner5d.library.model.manager.y0;
import com.planner5d.library.services.utility.k3;
import com.planner5d.library.widget.d1;
import com.planner5d.library.widget.textview.ButtonTextView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nAutoStyleListItemViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoStyleListItemViewHolder.kt\ncom/planner5d/library/dgenerator/fragment/list/AutoStyleListItemViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,89:1\n257#2,2:90\n257#2,2:92\n257#2,2:94\n1#3:96\n*S KotlinDebug\n*F\n+ 1 AutoStyleListItemViewHolder.kt\ncom/planner5d/library/dgenerator/fragment/list/AutoStyleListItemViewHolder\n*L\n50#1:90,2\n51#1:92,2\n52#1:94,2\n*E\n"})
public class l extends RecyclerView.g0 implements d1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f160331i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f160332j = 5.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f160333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final mb.g f160334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.services.bitmaploader.target.h f160335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final y0 f160336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f160337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.manager.builtin.i f160338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Function2<AutoStyle, Integer, Unit> f160339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private com.planner5d.library.services.bitmaploader.target.a f160340h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(@NotNull Context context, @NotNull mb.g binding, @NotNull com.planner5d.library.services.bitmaploader.target.h bitmapTargetManager, @NotNull y0 imageManager, int i10, @NotNull com.planner5d.library.model.manager.builtin.i builtInDataManager, @NotNull Function2<? super AutoStyle, ? super Integer, Unit> onClickListener) {
        super(binding.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(bitmapTargetManager, "bitmapTargetManager");
        Intrinsics.checkNotNullParameter(imageManager, "imageManager");
        Intrinsics.checkNotNullParameter(builtInDataManager, "builtInDataManager");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.f160333a = context;
        this.f160334b = binding;
        this.f160335c = bitmapTargetManager;
        this.f160336d = imageManager;
        this.f160337e = i10;
        this.f160338f = builtInDataManager;
        this.f160339g = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(l lVar, AutoStyle autoStyle, int i10, View view) {
        lVar.f160339g.invoke(autoStyle, Integer.valueOf(i10));
    }

    private final k3 j(AutoStyle autoStyle) {
        int iT = autoStyle.t();
        if (iT != com.planner5d.library.database.model.a.Ready.n()) {
            return iT == com.planner5d.library.database.model.a.Error.n() ? new k3(lb.b.s.RF, new Object[0]) : new k3(lb.b.s.SF, new Object[0]);
        }
        String quantityString = this.f160333a.getResources().getQuantityString(lb.b.q.f320700a, autoStyle.x(), Integer.valueOf(autoStyle.x()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return new k3(quantityString);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    private final k3 k(AutoStyle autoStyle) {
        String string;
        int iT = autoStyle.t();
        if (iT == com.planner5d.library.database.model.a.Ready.n()) {
            Integer numZ = autoStyle.z();
            if (numZ != null) {
                string = this.f160338f.b0(numZ.intValue()).b();
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
        } else if (iT == com.planner5d.library.database.model.a.Error.n()) {
            string = this.f160333a.getString(lb.b.s.OF);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else {
            Float fW = autoStyle.w();
            float fFloatValue = fW != null ? fW.floatValue() * 100 : 0.0f;
            string = fFloatValue + "% " + this.f160333a.getString(lb.b.s.PF);
        }
        return new k3(string);
    }

    @Override // com.planner5d.library.widget.d1
    public void a() {
        this.f160335c.d(this.f160340h);
        this.f160340h = null;
    }

    public void h(@NotNull final AutoStyle data, final int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        mb.g gVar = this.f160334b;
        gVar.f322885g.setText(k(data).i(this.f160333a));
        gVar.f322881c.setText(j(data).i(this.f160333a));
        AutoStyleImage autoStyleImage = (AutoStyleImage) CollectionsKt.firstOrNull((List) data.D());
        String strV = autoStyleImage != null ? autoStyleImage.v() : null;
        timber.log.b.f381052a.a("AutoStyle id=" + data.getId() + " status=" + data.t() + " hasError=" + data.C(), new Object[0]);
        if (strV != null) {
            ImageView image = gVar.f322883e;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            this.f160340h = com.planner5d.library.widget.bitmaptarget.a.b(image, this.f160335c);
            if (data.C()) {
                y0 y0Var = this.f160336d;
                com.planner5d.library.services.bitmaploader.target.a aVar = this.f160340h;
                int i11 = this.f160337e;
                y0Var.l(strV, 0, 0, aVar, 4L, new com.planner5d.library.services.bitmaploader.background.postprocess.c(i11, i11, 5.0f));
            } else {
                com.planner5d.library.services.q.a.a(this.f160336d, strV, 0, 0, this.f160340h, 0L, 16, null);
            }
        }
        ButtonTextView badgeNew = gVar.f322880b;
        Intrinsics.checkNotNullExpressionValue(badgeNew, "badgeNew");
        badgeNew.setVisibility(data.E() ? 0 : 8);
        ImageView iconError = gVar.f322882d;
        Intrinsics.checkNotNullExpressionValue(iconError, "iconError");
        iconError.setVisibility(data.C() ? 0 : 8);
        ButtonTextView restart = gVar.f322884f;
        Intrinsics.checkNotNullExpressionValue(restart, "restart");
        restart.setVisibility(data.C() ? 0 : 8);
        this.f160334b.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.dgenerator.fragment.list.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.i(this.f160328a, data, i10, view);
            }
        });
    }
}
