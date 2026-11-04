package sd;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public enum d {
    BeforeEditorLoaded("fiam_android_before_editor_loaded"),
    Home("fiam_android_home"),
    Projects("fiam_android_projects"),
    Contests("fiam_android_contests"),
    Profile("fiam_android_profile"),
    SnapshotsTab("fiam_android_snapshots_tab");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ kotlin.enums.a f375965i = kotlin.enums.c.c(k());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f375966a;

    d(String str) {
        this.f375966a = str;
    }

    @NotNull
    public static kotlin.enums.a<d> l() {
        return f375965i;
    }

    @NotNull
    public final String n() {
        return this.f375966a;
    }
}
