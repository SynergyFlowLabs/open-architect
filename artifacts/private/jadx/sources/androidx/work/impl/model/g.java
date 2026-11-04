package androidx.work.impl.model;

import androidx.lifecycle.w0;
import androidx.room.v1;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@androidx.room.l
public interface g {
    @v1(observedEntities = {v.class})
    @NotNull
    List<v.c> a(@NotNull w3.g gVar);

    @v1(observedEntities = {v.class})
    @NotNull
    kotlinx.coroutines.flow.i<List<v.c>> b(@NotNull w3.g gVar);

    @v1(observedEntities = {v.class})
    @NotNull
    w0<List<v.c>> c(@NotNull w3.g gVar);
}
