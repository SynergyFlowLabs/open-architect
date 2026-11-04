package t5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import jj.f;

/* JADX INFO: loaded from: classes4.dex */
@Target({})
@Retention(RetentionPolicy.SOURCE)
@f(allowedTargets = {})
public @interface a {
    String reason();

    String type();
}
