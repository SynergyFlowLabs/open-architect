package com.planner5d.library.activity.fragment.settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.f1;
import androidx.annotation.y;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class p extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f135354c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<id.e, Unit> f135355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private id.e[] f135356b;

    @w0(parameters = 0)
    @SourceDebugExtension({"SMAP\nViewSocialAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewSocialAdapter.kt\ncom/planner5d/library/activity/fragment/settings/ViewSocialAdapter$ViewHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"})
    public static final class a extends RecyclerView.g0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f135357f = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ImageView f135358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final TextView f135359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final TextView f135360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final MaterialButton f135361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private id.e f135362e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent, @NotNull final Function1<? super id.e, Unit> onItemClickListener) {
            super(LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.P7, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
            View viewFindViewById = this.itemView.findViewById(com.planner5d.library.f.j.Ad);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f135358a = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(com.planner5d.library.f.j.tv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.f135359b = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(com.planner5d.library.f.j.f168066fe);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.f135360c = (TextView) viewFindViewById3;
            MaterialButton materialButton = (MaterialButton) this.itemView.findViewById(com.planner5d.library.f.j.M4);
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.settings.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    p.a.i(this.f135273a, onItemClickListener, view);
                }
            });
            this.f135361d = materialButton;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(a aVar, Function1 function1, View view) {
            id.e eVar = aVar.f135362e;
            if (eVar != null) {
                function1.invoke(eVar);
            }
        }

        private final void j(Context context, @f1 int i10, @androidx.annotation.n int i11, @androidx.annotation.n int i12, @y int i13) {
            this.f135361d.setBackgroundColor(androidx.core.content.d.g(context, i11));
            this.f135361d.setText(i10);
            this.f135361d.setTextColor(androidx.core.content.d.g(context, i12));
            this.f135361d.setTypeface(androidx.core.content.res.i.j(context, i13));
        }

        public final void h(@NotNull id.e item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f135362e = item;
            this.f135358a.setImageDrawable(com.planner5d.library.widget.drawable.c.f254258a.a(context, item.f().getIcon(), null));
            this.f135359b.setText(item.f().getTitle());
            TextView textView = this.f135360c;
            String strE = item.e();
            textView.setText(strE != null ? com.planner5d.library.services.textspan.b.d(context.getString(com.planner5d.library.f.s.IG, strE)) : null);
            if (item.e() == null) {
                j(context, com.planner5d.library.f.s.PC, com.planner5d.library.f.C1549f.Mh, com.planner5d.library.f.C1549f.Xn, com.planner5d.library.f.i.f167925d);
            } else {
                j(context, com.planner5d.library.f.s.RC, com.planner5d.library.f.C1549f.f166753vh, com.planner5d.library.f.C1549f.f166273bi, com.planner5d.library.f.i.f167926e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull Function1<? super id.e, Unit> onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.f135355a = onItemClickListener;
        this.f135356b = new id.e[0];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f135356b.length;
    }

    @NotNull
    public final id.e[] h() {
        return this.f135356b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull a holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.h(this.f135356b[i10]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent, this.f135355a);
    }

    @e.a({"NotifyDataSetChanged"})
    public final void k(@NotNull id.e[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f135356b = value;
        notifyDataSetChanged();
    }
}
