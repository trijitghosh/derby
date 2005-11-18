/*

   Derby - Class org.apache.derby.impl.jdbc.EmbedCallableStatement40

   Copyright 2005 The Apache Software Foundation or its licensors, as applicable.

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

package org.apache.derby.impl.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.sql.NClob;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;

public class EmbedCallableStatement40 extends EmbedCallableStatement30 {
    
    
    
    EmbedPreparedStatement40 ps;
    /** Creates a new instance of EmbedCallableStatement40 */
    public EmbedCallableStatement40(EmbedConnection conn, String sql,
        int resultSetType,
        int resultSetConcurrency,
        int resultSetHoldability) throws SQLException{
        super(conn, sql, resultSetType, resultSetConcurrency, resultSetHoldability);
        ps = new EmbedPreparedStatement40(conn, sql, false,
            resultSetType,
            resultSetConcurrency,
            resultSetHoldability,
            java.sql.Statement.NO_GENERATED_KEYS,
            null,
            null);
    }
    
    
    public RowId getRowId(int parameterIndex) throws SQLException {
        throw Util.notImplemented();
    }
    
    public RowId getRowId(String parameterName) throws SQLException {
        throw Util.notImplemented();
    }
    
    public void setRowId(String parameterName, RowId x) throws SQLException {
        throw Util.notImplemented();
    }
    
    
    public void setNString(String parameterName, String value)
    throws SQLException {
        throw Util.notImplemented();
    }
    
    public void setNCharacterStream(String parameterName, Reader value, long length)
    throws SQLException {
        throw Util.notImplemented();
    }
    
    public void setNClob(String parameterName, NClob value) throws SQLException {
        throw Util.notImplemented();
    }
    
    public void setClob(String parameterName, Reader reader, long length)
    throws SQLException{
        throw Util.notImplemented();
        
    }
    
    public void setBlob(String parameterName, InputStream inputStream, long length)
    throws SQLException{
        throw Util.notImplemented();
    }
    
    public void setNClob(String parameterName, Reader reader, long length)
    throws SQLException {
        throw Util.notImplemented();
    }
    
    public NClob getNClob(int i) throws SQLException {
        throw Util.notImplemented();
    }
    
    
    public NClob getNClob(String parameterName) throws SQLException {
        throw Util.notImplemented();
    }
    
    public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {
        throw Util.notImplemented();
        
    }
    
    public SQLXML getSQLXML(int parameterIndex) throws SQLException {
        throw Util.notImplemented();
    }
    
    public SQLXML getSQLXML(String parametername) throws SQLException {
        throw Util.notImplemented();
    }
    
    
    
    
    
    /************************************************************************
     * The prepared statement methods
     *************************************************************************/
    
    
    public void setRowId(int parameterIndex, RowId x) throws SQLException{
        ps.setRowId(parameterIndex,x);
    }
    
    public void setNString(int index, String value) throws SQLException{
        ps.setNString(index,value);
    }
    
    public void setNCharacterStream(int index, Reader value, long length) throws SQLException{
        ps.setNCharacterStream(index,value,length);
    }
    
    public void setNClob(int index, NClob value) throws SQLException{
        ps.setNClob(index,value);
    }
    
    public void setClob(int parameterIndex, Reader reader, long length)
    throws SQLException{
        ps.setClob(parameterIndex,reader,length);
    }
    
    public void setBlob(int parameterIndex, InputStream inputStream, long length)
    throws SQLException{
        ps.setBlob(parameterIndex,inputStream,length);
    }
    public void setNClob(int parameterIndex, Reader reader, long length)
    throws SQLException{
        ps.setNClob(parameterIndex,reader,length);
    }
    
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException{
        ps.setSQLXML(parameterIndex,xmlObject);
    }
    
    public void setPoolable(boolean poolable)
    throws SQLException{
        ps.setPoolable(poolable);
    }
    
    public boolean isPoolable()
    throws SQLException{
        return ps.isPoolable();
    }
}
