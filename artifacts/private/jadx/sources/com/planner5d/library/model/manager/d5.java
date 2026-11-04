package com.planner5d.library.model.manager;

import android.content.SharedPreferences;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSynchronizationStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizationStorage.kt\ncom/planner5d/library/model/manager/SynchronizationStorage\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,62:1\n45#2,8:63\n45#2,8:71\n45#2,8:79\n*S KotlinDebug\n*F\n+ 1 SynchronizationStorage.kt\ncom/planner5d/library/model/manager/SynchronizationStorage\n*L\n16#1:63,8\n47#1:71,8\n56#1:79,8\n*E\n"})
public final class d5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f191290c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f191291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f191292b;

    @ij.a
    public d5(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f191291a = sharedPreferences;
        this.f191292b = new Object();
    }

    @androidx.annotation.m1
    @Nullable
    public final Long a(@NotNull String name, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(name, "name");
        synchronized (this.f191292b) {
            try {
                if (this.f191291a.contains(name)) {
                    l10 = Long.valueOf(this.f191291a.getLong(name, l10 != null ? l10.longValue() : 0L));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l10;
    }

    @androidx.annotation.m1
    @NotNull
    public final List<Long> b(@NotNull String name, @NotNull List<Long> value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f191292b) {
            try {
                if (this.f191291a.contains(name)) {
                    com.planner5d.library.services.utility.f0 f0Var = com.planner5d.library.services.utility.f0.f225226a;
                    value = f0Var.a(this.f191291a.getString(name, f0Var.b(value)));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return value;
    }

    @androidx.annotation.m1
    public final void c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        synchronized (this.f191292b) {
            SharedPreferences.Editor editorEdit = this.f191291a.edit();
            editorEdit.remove(name);
            editorEdit.commit();
            Unit unit = Unit.f312394a;
        }
    }

    @androidx.annotation.m1
    public final void d(@NotNull String name, @Nullable Long l10) {
        Intrinsics.checkNotNullParameter(name, "name");
        synchronized (this.f191292b) {
            try {
                SharedPreferences.Editor editorEdit = this.f191291a.edit();
                if (l10 != null) {
                    editorEdit.putLong(name, l10.longValue());
                } else {
                    editorEdit.remove(name);
                }
                editorEdit.commit();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @androidx.annotation.m1
    public final void e(@NotNull String name, @NotNull List<Long> value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f191292b) {
            SharedPreferences.Editor editorEdit = this.f191291a.edit();
            editorEdit.putString(name, com.planner5d.library.services.utility.f0.f225226a.b(value));
            editorEdit.commit();
            Unit unit = Unit.f312394a;
        }
    }
}
