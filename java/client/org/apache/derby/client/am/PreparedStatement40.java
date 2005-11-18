/*

   Derby - Class org.apache.derby.client.am.PreparedStatement40

   Copyright (c) 2005 The Apache Software Foundation or its licensors, where applicable.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package org.apache.derby.client.am;

import org.apache.derby.impl.jdbc.Util;
import java.sql.RowId;
import java.sql.NClob;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.io.Reader;
import java.io.InputStream;

public class  PreparedStatement40 extends  org.apache.derby.client.am.PreparedStatement{
    
    public PreparedStatement40(Agent agent,
        Connection connection,
        String sql,
        Section section) throws SQLException {
        super(agent, connection,sql,section);
    }
    
    public PreparedStatement40(Agent agent,
        Connection connection,
        String sql,
        int type, int concurrency, int holdability, int autoGeneratedKeys, String[] columnNames) throws SqlException {
        super(agent, connection, sql, type, concurrency, holdability, autoGeneratedKeys, columnNames);
    }
    
    
    
    public void setRowId(int parameterIndex, RowId x) throws SQLException{
        throw Util.notImplemented();
    }
    
    public void setNString(int index, String value) throws SQLException{
        throw Util.notImplemented();
    }
    
    public void setNCharacterStream(int index, Reader value, long length) throws SQLException{
        throw Util.notImplemented();
    }
    
    public void setNClob(int index, NClob value) throws SQLException{
        throw Util.notImplemented();
    }
    
    public void setClob(int parameterIndex, Reader reader, long length)
    throws SQLException{
        throw Util.notImplemented();
    }
    
    public void setBlob(int parameterIndex, InputStream inputStream, long length)
    throws SQLException{
        throw Util.notImplemented();
    }
    public void setNClob(int parameterIndex, Reader reader, long length)
    throws SQLException{
        throw Util.notImplemented();
    }
    
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException{
        throw Util.notImplemented();
    }
    
    public void setPoolable(boolean poolable)
    throws SQLException{
        throw Util.notImplemented();
    }
    
    public boolean isPoolable()
    throws SQLException{
        throw Util.notImplemented();
    }
}
