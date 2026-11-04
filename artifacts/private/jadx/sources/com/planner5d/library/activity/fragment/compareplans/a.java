package com.planner5d.library.activity.fragment.compareplans;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.SuperscriptSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.planner5d.library.databinding.o4;
import com.planner5d.library.databinding.p4;
import com.planner5d.library.databinding.q4;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@w0(parameters = 0)
public final class a extends RecyclerView.h<RecyclerView.g0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f131559b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<g> f131560a;

    /* JADX INFO: renamed from: com.planner5d.library.activity.fragment.compareplans.a$a, reason: collision with other inner class name */
    private static class C1448a extends RecyclerView.g0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1448a(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }

        public void g(@NotNull g item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }

        @e.a({"SetTextI18n"})
        public final void h(@NotNull TextView textView, @f1 int i10) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (i10 != 0) {
                textView.setText(i10);
            } else {
                textView.setText("");
            }
        }
    }

    private static final class b extends C1448a {
        /* JADX WARN: Illegal instructions before constructor call */
        public b(@NotNull o4 binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
        }
    }

    private static final class c extends C1448a {
        /* JADX WARN: Illegal instructions before constructor call */
        public c(@NotNull p4 binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
        }
    }

    private enum d {
        Header(0),
        Item(1),
        Footer(2);


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f131565f = kotlin.enums.c.c(k());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f131566a;

        d(int i10) {
            this.f131566a = i10;
        }

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f131565f;
        }

        public final int n() {
            return this.f131566a;
        }
    }

    private static final class e extends C1448a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final q4 f131567a;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(@NotNull q4 binding) {
            Intrinsics.checkNotNullParameter(binding, "binding");
            ConstraintLayout root = binding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.f131567a = binding;
        }

        private final Spanned i(int i10, boolean z10) {
            Context context = this.f131567a.getRoot().getContext();
            if (i10 == 0) {
                return new SpannedString("");
            }
            String string = context.getString(i10);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (!z10) {
                return new SpannedString(string);
            }
            String string2 = context.getString(com.planner5d.library.f.s.cG);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String upperCase = string2.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            String str = string + " " + upperCase;
            SpannableStringBuilder spannableStringBuilderM = com.planner5d.library.services.textspan.b.m(str, string.length(), str.length(), 33, new SuperscriptSpan(), new AbsoluteSizeSpan(com.github.danielnilsson9.colorpickerview.view.d.a(context, 7.0f)), new ForegroundColorSpan(androidx.core.content.d.g(context, com.planner5d.library.f.C1549f.Th)), new StyleSpan(1));
            Intrinsics.checkNotNullExpressionValue(spannableStringBuilderM, "setMultipleSpans(...)");
            return spannableStringBuilderM;
        }

        @Override // com.planner5d.library.activity.fragment.compareplans.a.C1448a
        public void g(@NotNull g item) {
            Intrinsics.checkNotNullParameter(item, "item");
            q4 q4Var = this.f131567a;
            q4Var.f159560d.setImageResource(item.j());
            q4Var.f159565i.setText(i(item.p(), item.o()));
            TextView premium = q4Var.f159563g;
            Intrinsics.checkNotNullExpressionValue(premium, "premium");
            h(premium, item.m());
            TextView pro = q4Var.f159564h;
            Intrinsics.checkNotNullExpressionValue(pro, "pro");
            h(pro, item.n());
            q4Var.f159562f.setImageResource(item.l());
            q4Var.f159561e.setImageResource(item.k());
        }
    }

    public a(@NotNull List<g> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f131560a = items;
    }

    private final g h(int i10) {
        return (i10 <= 0 || i10 > this.f131560a.size()) ? new g(0, 0, 0, 0, 0, 0, false, 124, null) : this.f131560a.get(i10 - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f131560a.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        if (i10 == 0) {
            return d.Header.n();
        }
        return i10 == this.f131560a.size() + 1 ? d.Footer.n() : d.Item.n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull RecyclerView.g0 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        C1448a c1448a = holder instanceof C1448a ? (C1448a) holder : null;
        if (c1448a != null) {
            c1448a.g(h(i10));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public RecyclerView.g0 onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(parent.getContext());
        if (i10 == d.Header.n()) {
            p4 p4VarD = p4.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(p4VarD, "inflate(...)");
            return new c(p4VarD);
        }
        if (i10 == d.Footer.n()) {
            o4 o4VarD = o4.d(layoutInflaterFrom, parent, false);
            Intrinsics.checkNotNullExpressionValue(o4VarD, "inflate(...)");
            return new b(o4VarD);
        }
        q4 q4VarD = q4.d(layoutInflaterFrom, parent, false);
        Intrinsics.checkNotNullExpressionValue(q4VarD, "inflate(...)");
        return new e(q4VarD);
    }
}
