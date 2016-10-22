package org.kuneo.stex.model.base;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserEntity implements Serializable {
  
  /**
   * シリアルバージョン
   */
  private static final long serialVersionUID = 5658387712051101356L;

  private String name;
  
  private String password;
  
  private String authority;
}
