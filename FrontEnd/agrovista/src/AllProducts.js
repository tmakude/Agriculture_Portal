import React, { useState, useEffect } from 'react';
import axios from 'axios';

function AllProduct() {
    const [products, setProducts] = useState([]);

    useEffect(() => {
        const fetchData = async () => {
            try {
                const response = await axios.get('http://localhost:8080/customer/all');
                setProducts(response.data);
            } catch (error) {
                console.error('Error fetching data:', error);
            }
        };

        fetchData();

        // Clean-up function can be added here if necessary
    }, []); // Empty dependency array ensures the effect runs only once after the initial render

    return (
        <>
            <div>
                <h1>This is the react page</h1>
            </div>
            
            <div className="container-fluid" style={{ width: "100%", background:"#ACBCFF" }}>
                <div className="card shadow bg-transparent">
                    <div className="card-body">
                        <div className="row">
                            <ol type="1">
                                {products.length > 0 ? (
                                    products.map(p => <li key={p.name}>{p.name}</li>)
                                ) : (
                                    <li>Loading...</li>
                                )}
                            </ol>
                        </div>
                        <div>
                            <h1>This is the react page</h1>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}

export default AllProduct;
