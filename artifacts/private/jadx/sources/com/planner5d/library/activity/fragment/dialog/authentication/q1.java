package com.planner5d.library.activity.fragment.dialog.authentication;

import android.view.View;
import android.view.ViewGroup;
import com.planner5d.library.databinding.m4;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class q1 extends n1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f131993d = 0;

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class a extends n1.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f131994b = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup parent) {
            super(parent, com.planner5d.library.f.m.f168788o7);
            Intrinsics.checkNotNullParameter(parent, "parent");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(n1.a aVar, SocialAuthType socialAuthType, View view) {
            aVar.a(socialAuthType);
        }

        @Override // com.planner5d.library.activity.fragment.dialog.authentication.n1.b
        public void h(@NotNull final SocialAuthType item, @NotNull final n1.a listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            m4 m4VarA = m4.a(this.itemView);
            boolean z10 = item == SocialAuthType.Code;
            m4VarA.f159350b.setText(z10 ? this.itemView.getContext().getString(com.planner5d.library.f.s.R6) : this.itemView.getContext().getString(com.planner5d.library.f.s.S6, item.getTitle()));
            m4VarA.f159350b.setCompoundDrawablesWithIntrinsicBounds(item.getIcon(), 0, 0, 0);
            View view = this.itemView;
            view.setBackgroundTintList(androidx.core.content.d.h(view.getContext(), z10 ? com.planner5d.library.f.C1549f.f166548n4 : com.planner5d.library.f.C1549f.f166521m1));
            m4VarA.f159350b.setTextColor(this.itemView.getContext().getColor(z10 ? com.planner5d.library.f.C1549f.f166521m1 : com.planner5d.library.f.C1549f.Xn));
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.p1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q1.a.i(listener, item, view2);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(@NotNull List<? extends SocialAuthType> serviceList, @NotNull n1.a listener) {
        super(serviceList, listener);
        Intrinsics.checkNotNullParameter(serviceList, "serviceList");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.planner5d.library.activity.fragment.dialog.authentication.n1, androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: i */
    public n1.b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new a(parent);
    }
}
