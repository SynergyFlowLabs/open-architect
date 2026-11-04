package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<? extends a> f304247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f304248b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f304249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f304250d;

    public b(@NotNull ArrayList<? extends a> arrayList) {
        this.f304247a = arrayList;
        this.f304249c = arrayList.size();
    }

    public static b c(@NotNull BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return new b(arrayList);
            }
            i10++;
            arrayList.add(new a(i10, line));
        }
    }

    public static b d(@NotNull File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            b bVarC = c(bufferedReader);
            bufferedReader.close();
            return bVarC;
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public boolean a() {
        return this.f304250d < this.f304249c;
    }

    @Nullable
    public a b() {
        int i10 = this.f304250d;
        if (i10 < this.f304248b || i10 >= this.f304249c) {
            return null;
        }
        ArrayList<? extends a> arrayList = this.f304247a;
        this.f304250d = i10 + 1;
        return arrayList.get(i10);
    }

    public void e() {
        this.f304250d--;
    }
}
