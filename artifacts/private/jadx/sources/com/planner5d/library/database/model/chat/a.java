package com.planner5d.library.database.model.chat;

import androidx.room.u;
import androidx.room.u0;
import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import com.devtodev.core.data.metrics.MetricConsts;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@u(tableName = "chat_messages")
public final class a implements va.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.room.i(index = true, name = "id")
    @u0(autoGenerate = true)
    private final int f154114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.room.i(name = "project_id")
    private final long f154115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.room.i(name = "created_at")
    private final long f154116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.room.i(name = "text")
    @NotNull
    private String f154117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.room.i(name = PeopleCardEntry.json)
    @Nullable
    private String f154118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.room.i(name = MetricConsts.ApplicationInfo)
    @Nullable
    private Boolean f154119f;

    public a(int i10, long j10, long j11, @NotNull String text, @Nullable String str, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f154114a = i10;
        this.f154115b = j10;
        this.f154116c = j11;
        this.f154117d = text;
        this.f154118e = str;
        this.f154119f = bool;
    }

    @l(message = "Use json instead")
    public static /* synthetic */ void e() {
    }

    @Override // va.b.a
    @Nullable
    public Boolean a() {
        return this.f154119f;
    }

    public final long b() {
        return this.f154116c;
    }

    public final int c() {
        return this.f154114a;
    }

    public final long d() {
        return this.f154115b;
    }

    public void f(@Nullable Boolean bool) {
        this.f154119f = bool;
    }

    public void g(@Nullable String str) {
        this.f154118e = str;
    }

    @Override // va.b.a
    @Nullable
    public String getJson() {
        return this.f154118e;
    }

    @Override // va.b.a
    @NotNull
    public String getText() {
        return this.f154117d;
    }

    public void h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f154117d = str;
    }

    public /* synthetic */ a(int i10, long j10, long j11, String str, String str2, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, j10, (i11 & 4) != 0 ? 0L : j11, str, str2, bool);
    }
}
