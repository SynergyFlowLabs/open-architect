package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(String str) {
        return "StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '" + str + "', but not both.";
    }
}
