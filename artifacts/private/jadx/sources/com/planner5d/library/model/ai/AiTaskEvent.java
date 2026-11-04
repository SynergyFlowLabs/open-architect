package com.planner5d.library.model.ai;

import androidx.compose.runtime.internal.w0;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.devtodev.core.data.consts.RequestParams;
import com.planner5d.library.activity.fragment.projects.g;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 0)
@Table(name = "ai_task_events")
public final class AiTaskEvent extends Model {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f180554a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f180555b = 8;

    @Column(name = MetricTracker.Action.SENT)
    @Nullable
    private Boolean sent;

    @Column(index = true, name = RequestParams.UID)
    @Nullable
    private Long uid;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AiTaskEvent a(@NotNull g.a task) {
            Intrinsics.checkNotNullParameter(task, "task");
            AiTaskEvent aiTaskEvent = new AiTaskEvent();
            aiTaskEvent.x(Long.valueOf(task.c()));
            aiTaskEvent.w(Boolean.FALSE);
            return aiTaskEvent;
        }

        private a() {
        }
    }

    @Nullable
    public final Boolean s() {
        return this.sent;
    }

    @Nullable
    public final Long u() {
        return this.uid;
    }

    public final boolean v() {
        return Intrinsics.areEqual(this.sent, Boolean.TRUE);
    }

    public final void w(@Nullable Boolean bool) {
        this.sent = bool;
    }

    public final void x(@Nullable Long l10) {
        this.uid = l10;
    }
}
