package com.planner5d.library.activity.fragment.dialog.authentication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.modules.user.auth.SocialAuthType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public class n1 extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f131824c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<SocialAuthType> f131825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f131826b;

    public interface a {
        void a(@NotNull SocialAuthType socialAuthType);
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f131827a = 0;

        public /* synthetic */ b(ViewGroup viewGroup, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(viewGroup, (i11 & 2) != 0 ? com.planner5d.library.f.m.f168777n7 : i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(a aVar, SocialAuthType socialAuthType, View view) {
            aVar.a(socialAuthType);
        }

        public void h(@NotNull final SocialAuthType item, @NotNull final a listener) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(listener, "listener");
            View view = this.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            appCompatTextView.setText(item.getTitle());
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(item.getIcon(), 0, 0, 0);
            appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.authentication.o1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    n1.b.i(listener, item, view2);
                }
            });
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ViewGroup parent, int i10) {
            super(LayoutInflater.from(parent.getContext()).inflate(i10, parent, false));
            Intrinsics.checkNotNullParameter(parent, "parent");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n1(@NotNull List<? extends SocialAuthType> serviceList, @NotNull a listener) {
        Intrinsics.checkNotNullParameter(serviceList, "serviceList");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f131825a = serviceList;
        this.f131826b = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f131825a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull b holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.h(this.f131825a.get(i10), this.f131826b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new b(parent, 0, 2, null);
    }
}
