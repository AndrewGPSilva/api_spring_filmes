CREATE TABLE filmes (
    id BIGINT NOT NULL AUTO_INCREMENT,  
    titulo VARCHAR(255) NOT NULL,       
    sinopse TEXT NOT NULL,              
    categoria VARCHAR(100) NOT NULL,    
    faixa VARCHAR(100) NOT NULL,        
    imagem VARCHAR(255) NOT NULL,       
    streaming VARCHAR(255) NOT NULL,      
    PRIMARY KEY (id)                    
);