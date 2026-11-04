package com.planner5d.library.activity.fragment.feed.holders;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.databinding.x5;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nViewHolderFeedDesignGeneratorLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewHolderFeedDesignGeneratorLabel.kt\ncom/planner5d/library/activity/fragment/feed/holders/ViewHolderFeedDesignGeneratorLabel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,10:1\n1#2:11\n*E\n"})
public final class m extends com.planner5d.library.feed.view.holders.c<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f133437a = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TextView root = x5.c(LayoutInflater.from(context)).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        super(root);
    }
}
