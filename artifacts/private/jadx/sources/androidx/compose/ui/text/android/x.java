package androidx.compose.ui.text.android;

import java.text.CharacterIterator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class x implements CharacterIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41442e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f41443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f41444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f41446d;

    public x(@NotNull CharSequence charSequence, int i10, int i11) {
        this.f41443a = charSequence;
        this.f41444b = i10;
        this.f41445c = i11;
        this.f41446d = i10;
    }

    @Override // java.text.CharacterIterator
    @NotNull
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f41446d;
        return i10 == this.f41445c ? kotlin.jvm.internal.r.f312787c : this.f41443a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f41446d = this.f41444b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f41444b;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f41445c;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f41446d;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f41444b;
        int i11 = this.f41445c;
        if (i10 == i11) {
            this.f41446d = i11;
            return kotlin.jvm.internal.r.f312787c;
        }
        int i12 = i11 - 1;
        this.f41446d = i12;
        return this.f41443a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f41446d + 1;
        this.f41446d = i10;
        int i11 = this.f41445c;
        if (i10 < i11) {
            return this.f41443a.charAt(i10);
        }
        this.f41446d = i11;
        return kotlin.jvm.internal.r.f312787c;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f41446d;
        if (i10 <= this.f41444b) {
            return kotlin.jvm.internal.r.f312787c;
        }
        int i11 = i10 - 1;
        this.f41446d = i11;
        return this.f41443a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f41444b;
        if (i10 > this.f41445c || i11 > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f41446d = i10;
        return current();
    }
}
