package com.planner5d.library.widget.editor.projectsettings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.w0;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.z4;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class e extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258106b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<a> f258107a;

    @w0(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f258108d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f258109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f258110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Function0<Unit> f258111c;

        public a(@NotNull String formattedDate, @NotNull String formattedSize, @NotNull Function0<Unit> onSelected) {
            Intrinsics.checkNotNullParameter(formattedDate, "formattedDate");
            Intrinsics.checkNotNullParameter(formattedSize, "formattedSize");
            Intrinsics.checkNotNullParameter(onSelected, "onSelected");
            this.f258109a = formattedDate;
            this.f258110b = formattedSize;
            this.f258111c = onSelected;
        }

        @NotNull
        public final String a() {
            return this.f258109a;
        }

        @NotNull
        public final String b() {
            return this.f258110b;
        }

        @NotNull
        public final Function0<Unit> c() {
            return this.f258111c;
        }
    }

    public e(@NotNull List<a> projectRevisions) {
        Intrinsics.checkNotNullParameter(projectRevisions, "projectRevisions");
        this.f258107a = projectRevisions;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f258107a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull b holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.i(this.f258107a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new b(parent);
    }

    @w0(parameters = 0)
    public static final class b extends RecyclerView.g0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f258112c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final z4 f258113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Function0<Unit> f258114b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull z4 binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f258113a = binding;
            binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.widget.editor.projectsettings.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.b.h(this.f258115a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(b bVar, View view) {
            Function0<Unit> function0 = bVar.f258114b;
            if (function0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("onSelected");
                function0 = null;
            }
            function0.invoke();
        }

        public final void i(@NotNull a item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f258113a.f160021c.setText(item.a());
            this.f258113a.f160022d.setText(item.b());
            this.f258114b = item.c();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            z4 z4VarD = z4.d(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(z4VarD, "inflate(...)");
            this(z4VarD);
        }
    }
}
