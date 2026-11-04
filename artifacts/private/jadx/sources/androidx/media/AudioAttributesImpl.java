package androidx.media;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public interface AudioAttributesImpl extends androidx.versionedparcelable.h {

    public interface a {
        @NonNull
        a a(int usage);

        @NonNull
        a b(int streamType);

        @NonNull
        AudioAttributesImpl build();

        @NonNull
        a c(int contentType);

        @NonNull
        a v(int flags);
    }

    int I();

    int Z4();

    int a5();

    int b5();

    int c5();

    @p0
    Object e();

    int getContentType();
}
