package hh;

import hh.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface a<Config extends b> {
    @NotNull
    Config getModuleConfig();

    @NotNull
    String getModuleName();

    void initialize();
}
