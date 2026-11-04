package com.planner5d.library.aichat.view.bottomsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.planner5d.library.aichat.command.AiChatCommand;
import com.planner5d.library.widget.preloader.shimmer.ShimmerTextView;
import io.noties.markwon.core.spans.LinkSpan;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nEditorChatAiViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorChatAiViewHolder.kt\ncom/planner5d/library/aichat/view/bottomsheet/EditorChatAiViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n299#2,2:86\n257#2,2:88\n257#2,2:90\n257#2,2:92\n257#2,2:95\n257#2,2:97\n257#2,2:99\n257#2,2:101\n1863#3:94\n1864#3:103\n1#4:104\n*S KotlinDebug\n*F\n+ 1 EditorChatAiViewHolder.kt\ncom/planner5d/library/aichat/view/bottomsheet/EditorChatAiViewHolder\n*L\n40#1:86,2\n41#1:88,2\n47#1:90,2\n54#1:92,2\n60#1:95,2\n65#1:97,2\n69#1:99,2\n70#1:101,2\n57#1:94\n57#1:103\n*E\n"})
public final class b0 extends RecyclerView.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f142017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final wa.e f142018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, Unit> f142019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f142020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final io.noties.markwon.e f142021e;

    public static final class a extends io.noties.markwon.a {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object m(io.noties.markwon.g configuration, io.noties.markwon.u uVar) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            io.noties.markwon.core.c cVarH = configuration.h();
            io.noties.markwon.r<String> rVar = io.noties.markwon.core.b.f297498e;
            Intrinsics.checkNotNull(uVar);
            return new LinkSpan(cVarH, rVar.g(uVar), configuration.e());
        }

        @Override // io.noties.markwon.a, io.noties.markwon.i
        public void e(io.noties.markwon.k.a builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.e(org.commonmark.node.r.class, new io.noties.markwon.x() { // from class: com.planner5d.library.aichat.view.bottomsheet.a0
                @Override // io.noties.markwon.x
                public final Object a(io.noties.markwon.g gVar, io.noties.markwon.u uVar) {
                    return b0.a.m(gVar, uVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(@NotNull Context context, @NotNull wa.e item, @NotNull Function1<? super String, Unit> listener, @NotNull Function0<Unit> paywallListener) {
        super(item.getRoot());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(paywallListener, "paywallListener");
        this.f142017a = context;
        this.f142018b = item;
        this.f142019c = listener;
        this.f142020d = paywallListener;
        io.noties.markwon.e eVarBuild = io.noties.markwon.e.a(context).a(new a()).build();
        Intrinsics.checkNotNullExpressionValue(eVarBuild, "build(...)");
        this.f142021e = eVarBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(b0 b0Var, View view) {
        b0Var.f142020d.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(AiChatCommand aiChatCommand, b0 b0Var, View view) {
        String strI = aiChatCommand.i();
        if (strI != null) {
            b0Var.f142019c.invoke(strI);
        }
    }

    public final void i(@NotNull d0 message) {
        Intrinsics.checkNotNullParameter(message, "message");
        boolean zAreEqual = Intrinsics.areEqual(message.c().n(), com.planner5d.library.services.r.chatLoadingMessage.f224891a);
        TextView text = this.f142018b.f385985i;
        Intrinsics.checkNotNullExpressionValue(text, "text");
        text.setVisibility(zAreEqual ? 8 : 0);
        LinearLayout loader = this.f142018b.f385982f;
        Intrinsics.checkNotNullExpressionValue(loader, "loader");
        loader.setVisibility(zAreEqual ? 0 : 8);
        ShimmerTextView shimmerTextView = this.f142018b.f385984h;
        String strM = message.c().m();
        shimmerTextView.setText((strM == null || StringsKt.w3(strM)) ? this.f142017a.getString(sa.b.q.f369702a0) : message.c().m());
        MaterialButton buttonPaywall = this.f142018b.f385980d;
        Intrinsics.checkNotNullExpressionValue(buttonPaywall, "buttonPaywall");
        buttonPaywall.setVisibility(8);
        if (!zAreEqual) {
            this.f142021e.k(this.f142018b.f385985i, message.c().n());
        }
        ColorStateList colorStateListH = androidx.core.content.d.h(this.f142017a, sa.b.e.f367746cm);
        ColorStateList colorStateListH2 = androidx.core.content.d.h(this.f142017a, sa.b.e.f368226xe);
        float dimension = this.f142017a.getResources().getDimension(sa.b.f.Jc);
        ChipGroup commands = this.f142018b.f385981e;
        Intrinsics.checkNotNullExpressionValue(commands, "commands");
        commands.setVisibility(8);
        if (!message.c().i().isEmpty()) {
            this.f142018b.f385981e.removeAllViews();
            for (final AiChatCommand aiChatCommand : message.c().i()) {
                String strG = aiChatCommand.g();
                if (Intrinsics.areEqual(strG, com.planner5d.library.services.r.aiChatCommandShowPaywall.f224891a)) {
                    MaterialButton buttonPaywall2 = this.f142018b.f385980d;
                    Intrinsics.checkNotNullExpressionValue(buttonPaywall2, "buttonPaywall");
                    buttonPaywall2.setVisibility(0);
                    this.f142018b.f385980d.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.aichat.view.bottomsheet.y
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            b0.j(this.f142161a, view);
                        }
                    });
                } else if (Intrinsics.areEqual(strG, com.planner5d.library.services.r.aiChatCommandCloseChat.f224891a)) {
                    MaterialButton buttonPaywall3 = this.f142018b.f385980d;
                    Intrinsics.checkNotNullExpressionValue(buttonPaywall3, "buttonPaywall");
                    buttonPaywall3.setVisibility(8);
                } else {
                    ChipGroup commands2 = this.f142018b.f385981e;
                    Intrinsics.checkNotNullExpressionValue(commands2, "commands");
                    commands2.setVisibility(0);
                    MaterialButton buttonPaywall4 = this.f142018b.f385980d;
                    Intrinsics.checkNotNullExpressionValue(buttonPaywall4, "buttonPaywall");
                    buttonPaywall4.setVisibility(8);
                    ChipGroup chipGroup = this.f142018b.f385981e;
                    Chip chip = new Chip(this.f142017a);
                    chip.setText(aiChatCommand.j());
                    chip.setChipBackgroundColor(colorStateListH);
                    chip.setChipStrokeColor(colorStateListH2);
                    chip.setChipStrokeWidth(dimension);
                    chip.setEnsureMinTouchTargetSize(false);
                    chip.setOnClickListener(new View.OnClickListener() { // from class: com.planner5d.library.aichat.view.bottomsheet.z
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            b0.k(aiChatCommand, this, view);
                        }
                    });
                    chipGroup.addView(chip);
                }
            }
        }
    }
}
