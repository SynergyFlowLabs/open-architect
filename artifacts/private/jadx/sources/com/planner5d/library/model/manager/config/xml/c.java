package com.planner5d.library.model.manager.config.xml;

import android.content.SharedPreferences;
import com.planner5d.library.model.manager.config.q;
import kotlin.b1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences.Editor f190968a;

    public c(@NotNull SharedPreferences.Editor sharedPreferencesEditor) {
        Intrinsics.checkNotNullParameter(sharedPreferencesEditor, "sharedPreferencesEditor");
        this.f190968a = sharedPreferencesEditor;
    }

    @Override // com.planner5d.library.model.manager.config.q
    @l(message = "use the one with a typed key", replaceWith = @b1(expression = "set()", imports = {}))
    public void a(@NotNull String keyName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        this.f190968a.putString(keyName, str);
    }

    @Override // com.planner5d.library.model.manager.config.q
    @l(message = "use coroutines", replaceWith = @b1(expression = "commit()", imports = {}))
    public void b() {
        this.f190968a.commit();
    }

    @Override // com.planner5d.library.model.manager.config.q
    @l(message = "use the one with a typed key", replaceWith = @b1(expression = "remove()", imports = {}))
    public void remove(@NotNull String keyName) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        this.f190968a.remove(keyName);
    }
}
