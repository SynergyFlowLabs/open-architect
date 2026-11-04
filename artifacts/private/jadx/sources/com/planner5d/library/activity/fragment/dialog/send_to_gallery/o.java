package com.planner5d.library.activity.fragment.dialog.send_to_gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.model.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class o extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f132924e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<x> f132925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f132926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f132927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<x> f132928d;

    public interface a {
        void a(@NotNull List<? extends x> list);
    }

    @w0(parameters = 1)
    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f132929a = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        public final void g(@NotNull x data, boolean z10, boolean z11, @NotNull View.OnClickListener onClick) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(onClick, "onClick");
            TextView textView = (TextView) this.itemView.findViewById(com.planner5d.library.f.j.su);
            textView.setText(data.f222848b);
            textView.setSelected(z10);
            textView.setEnabled(z10 || !z11);
            textView.setOnClickListener(onClick);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull List<? extends x> data, @NotNull a listener) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f132925a = data;
        this.f132926b = listener;
        this.f132927c = 5;
        this.f132928d = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(o oVar, x xVar, View view) {
        int size = oVar.f132928d.size();
        if (oVar.f132928d.contains(xVar)) {
            oVar.f132928d.remove(xVar);
            view.setSelected(false);
            if (size == oVar.f132927c) {
                oVar.notifyDataSetChanged();
            }
        } else {
            oVar.f132928d.add(xVar);
            view.setSelected(true);
            if (size + 1 == oVar.f132927c) {
                oVar.notifyDataSetChanged();
            }
        }
        oVar.f132926b.a(oVar.f132928d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f132925a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @e.a({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull b holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final x xVar = this.f132925a.get(i10);
        holder.g(xVar, this.f132928d.contains(xVar), this.f132928d.size() == this.f132927c, new View.OnClickListener() { // from class: com.planner5d.library.activity.fragment.dialog.send_to_gallery.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.j(this.f132922a, xVar, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(com.planner5d.library.f.m.E3, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new b(viewInflate);
    }
}
