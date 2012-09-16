// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;

public interface ErlangRecordExpression extends ErlangExpression {

  @Nullable
  ErlangMaxExpression getMaxExpression();

  @Nullable
  ErlangRecordField getRecordField();

  @Nullable
  ErlangRecordRef getRecordRef();

  @Nullable
  ErlangRecordTuple getRecordTuple();

  @Nullable
  PsiReference getReference();

}
