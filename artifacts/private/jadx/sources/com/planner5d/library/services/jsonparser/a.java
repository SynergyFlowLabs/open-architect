package com.planner5d.library.services.jsonparser;

import android.util.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a<T> {
    protected abstract T a(@NotNull b bVar) throws IllegalStateException, IOException, NumberFormatException;

    public final T b(@NotNull InputStream inputStream) throws IllegalStateException, IOException, NumberFormatException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return a(new b(new JsonReader(new InputStreamReader(inputStream))));
    }
}
